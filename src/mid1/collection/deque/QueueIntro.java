package mid1.collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueIntro {
    /**
     * --------
     * 3->2->1
     * -------
     * FIFO
     * 큐에 넣기 offer
     * 큐에서 넣기 poll
     */

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(); // 훨씬 빠르다.
        // Queue<Integer> queue = new LinkedList<>();

        // 데이터 추가
        queue.offer(1);
        queue.offer(2);

        System.out.println("queue = " + queue);

        // 꺼내지 않고 조회만
        System.out.println(queue.peek());

        // 데이터 꺼내기
        System.out.println("queue.poll() = " + queue.poll());
    }
}
