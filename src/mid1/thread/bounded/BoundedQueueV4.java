package mid1.thread.bounded;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 대기 집합을 어떻게 분리할까?
 * - Lock 인터페이스와 ReentrantLock 구현체를 사용하자!
 */
public class BoundedQueueV4 implements BoundedQueue {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV4(int max) {
        this.max = max;
    }

    // 줄을 세워야 한다. => 동기화 사용
    @Override
    public void put(String data) {
        lock.lock();
        try {
            while (queue.size() == max) {
                System.out.println("[put] 큐가 가득 참, 생산자 대기 ");
                try {
                    condition.await(); // 스레드가 기다린다.
                    System.out.println("[put] 생산자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.offer(data);
            System.out.println("[put] 생산자 데이터 저장, notify() 호출");
            condition.signal(); // 대기하던 스레드가 깨어남
        } finally {
           lock.unlock();
        }
    }

    // 줄을 세워야 한다. => 동기화 사용
    @Override
    public String take() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                System.out.println("[take] 큐에 데이터가 없음, 소비자 대기 ");
                try {
                    condition.await();
                    System.out.println("[take] 소비자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            String data = queue.poll();
            System.out.println("[take] 소비자 데이터 획득, notify() 호출");
            condition.signal();
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
