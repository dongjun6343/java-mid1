package mid1.thread.sync;

public class BankAccountV1 implements BankAccount {

    private int balance = 0;

    public BankAccountV1(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount){
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
    public int getBalance() {
        return balance;
    }
}
