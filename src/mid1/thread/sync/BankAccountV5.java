package mid1.thread.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountV5 implements BankAccount {

    private int balance = 0;

    private final Lock lock = new ReentrantLock();

    public BankAccountV5(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        System.out.println("거래 시작 : " + getClass().getSimpleName());

        if (!lock.tryLock()) {
            System.out.println("[진입 실패] 이미 처리중인 작업처리가 있습니다.");
            return false;
        }
        // 출금액 검증 ==== 임계영역 시작 ====
        lock.lock();
        try {
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
        } finally {
            lock.unlock(); // lock을 걸면 만드시 unlock을 한다!
        }
        // ==== 임계영역 종료 ====

        System.out.println("거래 종료");
        return true;
    }

    @Override
    public int getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}
