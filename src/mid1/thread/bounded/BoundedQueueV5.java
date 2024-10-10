package mid1.thread.bounded;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 생산자, 소비자 락 대기 공간 분리
 * private final Condition producerCond = lock.newCondition();
 * private final Condition consumerCond = lock.newCondition();
 */
public class BoundedQueueV5 implements BoundedQueue {

    private final Lock lock = new ReentrantLock();
    private final Condition producerCond = lock.newCondition();
    private final Condition consumerCond = lock.newCondition();

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV5(int max) {
        this.max = max;
    }

    @Override
    public void put(String data) {
        lock.lock();
        try {
            while (queue.size() == max) {
                System.out.println("[put] 큐가 가득 참, 생산자 대기 ");
                try {
                    producerCond.await();
                    System.out.println("[put] 생산자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("[put] 생산자 데이터 저장, consumerCond.signal() 호출");
            queue.offer(data);
            consumerCond.signal();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String take() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                System.out.println("[take] 큐에 데이터가 없음, 소비자 대기 ");
                try {
                    consumerCond.await();
                    System.out.println("[take] 소비자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            String data = queue.poll();
            System.out.println("[take] 소비자 데이터 획득, producerCond.signal() 호출");
            producerCond.signal();
            return data;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
