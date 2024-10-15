package mid1.thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BoundedQueueV6_2 implements BoundedQueue {

    private BlockingQueue<String> queue;

    public BoundedQueueV6_2(int max) {
        this.queue = new ArrayBlockingQueue<>(max);
    }

    // 두 메서드는 스레드가 대기하지 않는다.
    // 버퍼가 가득 차있는 경우 데이터를 추가하지 않고 즉시 false 반환
    // 버퍼에 데이터가 없는 경우 대기하지 않고 null을 반환

    @Override
    public void put(String data) {
        boolean offer = queue.offer(data);
        System.out.println("저장 시도 결과 = " + offer);
    }

    @Override
    public String take() {
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
