package mid1.thread.sync;

public class BankAccountV3 implements BankAccount {

    private int balance = 0;

    public BankAccountV3(int initialBalance) {
        this.balance = initialBalance;
    }

    // synchronized : 성능이 떨어질 수 있다. 필요한 부분만 써야한다!!
    // 거래시작, 거래종료는 공유변수를 쓰는게 아니라서 사용할 필요 없다. => synchronized 코드 블럭을 사용하자
    @Override
    public boolean withdraw(int amount) {
        System.out.println("거래 시작 : " + getClass().getSimpleName());

        // 출금액 검증 ==== 임계영역 시작 ====
        synchronized (this) { // ()안에 들어가는 값은 락을 획득할 인스턴스의 참조이다.
            System.out.println("[검증 시작] 출금액 : " + amount + " , 잔액: " + balance);
            if (balance < amount) {
                System.out.println("[검증 실패] 출금액 : " + amount + " , 잔액: " + balance);
                return false;
            }

            // 잔고가 출금액보다 많으면 진행
            System.out.println("[검증 완료] 출금액 : " + amount + ", 잔액 : " + balance);
            balance = balance - amount; // 출금에 걸리는 시간으로 가정
            System.out.println("[검증 완료] 출금액 : " + amount + ", 잔액 : " + balance);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // ==== 임계영역 종료 ====

        System.out.println("거래 종료");
        return true;
    }

    /**
     * 거래 시작 : BankAccountV3
     * 거래 시작 : BankAccountV3
     * [검증 시작] 출금액 : 800 , 잔액: 1000
     * [검증 완료] 출금액 : 800, 잔액 : 1000
     * [검증 완료] 출금액 : 800, 잔액 : 200
     * t1.getState() = TIMED_WAITING
     * t2.getState() = BLOCKED
     * 거래 종료
     * [검증 시작] 출금액 : 800 , 잔액: 200
     * [검증 실패] 출금액 : 800 , 잔액: 200
     */

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
