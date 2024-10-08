package mid1.thread.bounded;


import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 스레드가 기다리도록 구현 - V2
 */
public class BoundedQueueV2 implements BoundedQueue{

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV2(int max) {
        this.max = max;
    }

    // 줄을 세워야 한다. => 동기화 사용
    @Override
    public synchronized void put(String data) {
        while (queue.size() == max) {
            System.out.println("[put] 큐가 가득 참, 생산자 대기 ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.offer(data);
    }

    // 줄을 세워야 한다. => 동기화 사용
    @Override
    public synchronized String take() {
        while (queue.isEmpty()) {
            System.out.println("[take] 큐에 데이터가 없음, 소비자 대기 ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
