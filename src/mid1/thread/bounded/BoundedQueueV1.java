package mid1.thread.bounded;


import java.util.ArrayDeque;
import java.util.Queue;

public class BoundedQueueV1 implements BoundedQueue{

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV1(int max) {
        this.max = max;
    }

    // 줄을 세워야 한다. => 동기화 사용
    @Override
    public synchronized void put(String data) {
        if (queue.size() == max) {
            System.out.println("[put] 큐가 가득 참, 버림 : " + data);
            return;
        }
        queue.offer(data);
    }

    // 줄을 세워야 한다. => 동기화 사용
    @Override
    public synchronized String take() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
