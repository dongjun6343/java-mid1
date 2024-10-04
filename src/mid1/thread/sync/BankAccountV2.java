package mid1.thread.sync;

public class BankAccountV2 implements BankAccount {

    private int balance = 0;

    public BankAccountV2(int initialBalance) {
        this.balance = initialBalance;
    }

    // synchronized => 동기화. 해당 메서드는 하나의 스레드만! (줄을 세운다!!)
    @Override
    public synchronized boolean withdraw(int amount) {
        System.out.println("거래 시작 : " + getClass().getSimpleName());

        // 출금액 검증
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

        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
