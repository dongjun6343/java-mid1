package mid1.thread.sync;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
//        BankAccount account = new BankAccountV1(1000); // x001
//        BankAccount account = new BankAccountV2(1000); // x001
        BankAccount account = new BankAccountV3(1000); // x001

//        Thread t1 = new Thread(new WithdrawTask(x001, 800), "t1");
//        Thread t2 = new Thread(new WithdrawTask(x001, 800), "t2"); => 두 스레드는 같은 계좌 (x001)에 대해서 출금 시도를 한다.

        // @Override
        //    public void run() {
        //        account.withdraw(amount); => t1, t2는 같은 인스턴스에 접근. 같은 잔액을 사용함. => 공유 자원.
        //    }

        // 동시에 800원 출금
        Thread t1 = new Thread(new WithdrawTask(account, 800), "t1");
        Thread t2 = new Thread(new WithdrawTask(account, 800), "t2");

        t1.start();
        t2.start();

        Thread.sleep(500); // 검증까지 대기
        System.out.println("t1.getState() = " + t1.getState());
        System.out.println("t2.getState() = " + t2.getState());

        t1.join();
        t2.join();

        /**
         * [검증 시작] 출금액 : 800 , 잔액: 1000
         * [검증 시작] 출금액 : 800 , 잔액: 1000
         * [검증 완료] 출금액 : 800, 잔액 : 1000
         * [검증 완료] 출금액 : 800, 잔액 : 1000
         * [검증 완료] 출금액 : 800, 잔액 : 200
         * [검증 완료] 출금액 : 800, 잔액 : -600 => 문제 발생
         *
         * balance 값에 volatile을 도입하면 해결될까? => 그렇지 않다.
         * volatile은 스레드 값이 변경되었을때 다른 스레드에서 변경된 값을 즉시 볼 수 있게 하는 메모리의 가시성을 해결하는 것 뿐이다.
         * 해당 문제는 메모리 가시성 문제가 아니라 근본적인 문제는 동시성 문제이기 때문에 여전히 같은 문제 발생.
         *
         * [근본적인 문제]
         * 검증 로직을 통과하고 바로 잔액을 줄였다면 문제가 없지만, 검증 로직을 통과 후 잔액을 줄이기 전에 t2에서 먼저 검증 로직을 확인함.
         *
         * ------------------------------------------------------
         * 잔액은 여러 스레드가 함께 사용하는 공유자원이다. => 검증 단계에서 확인한 잔액은 출금 단계까지 유지가 되어야 한다.
         * => 한번에 하나의 스레드만 실행하려면?
         *  - 줄을 세워야한다.  t1 스레드가 완료되면 t2이 시작하도록 변경
         * => 그럼 어떻게 한번에 하나의 스레드만 접근할 수 있도록 임계 영역을 안전하게 보호할 수 있을까?
         *  - synchronized를 사용!
         *
         *
         * 하지만, synchronized는 락이 풀릴 때까지 무한 대기한다. (가장 큰 단점!!!)
         * => 결국 더 유연하고 세밀한 제어가 가능한 방법이 필요하게 되었다.
         * => 이걸 해결하기 위해 java.util.concurrent라는 동시성 문제 해결을 위한 라이브러리 패키지가 추가되었다.
         */
    }
}
