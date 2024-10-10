package mid1.thread.bounded;


import java.util.ArrayDeque;
import java.util.Queue;

/**
 * V3
 * wait()로 스레드를 대기 상태에 빠지게 한다.
 * notify()로 스레드를 깨운다.
 *
 * [문제]
 * 같은 종류의 스레드를 깨울 때 비효율이 발생한다.
 * [해결방안]
 * 생산자가 소비자를 깨우고 소비자가 생산자를 깨운다면 비효율이 없어지지 않을까? - V4
 */
public class BoundedQueueV3 implements BoundedQueue {

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV3(int max) {
        this.max = max;
    }

    // 줄을 세워야 한다. => 동기화 사용
    @Override
    public synchronized void put(String data) {
        while (queue.size() == max) {
            System.out.println("[put] 큐가 가득 참, 생산자 대기 ");
            try {
                wait(); // RUNNABLE -> WAITING , 락 반납
                System.out.println("[put] 생산자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.offer(data);
        System.out.println("[put] 생산자 데이터 저장, notify() 호출");
        notify(); // 대기 스레드 , WAIT -> BLOCKED
    }

    // 줄을 세워야 한다. => 동기화 사용
    @Override
    public synchronized String take() {
        while (queue.isEmpty()) {
            System.out.println("[take] 큐에 데이터가 없음, 소비자 대기 ");
            try {
                wait();
                System.out.println("[take] 소비자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String data = queue.poll();
        System.out.println("[take] 소비자 데이터 획득, notify() 호출");
        notify(); // 대기 스레드 , WAIT -> BLOCKED
        return data;
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
