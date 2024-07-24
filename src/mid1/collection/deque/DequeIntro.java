package mid1.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeIntro {
    /**
     * Double Ended Queue 의 약자
     * Queue와 Stack의 기능을 모두 포함하고 있다. 매우 유연한 자료구조
     */

    public static void main(String[] args) {
        // 현대 컴퓨터 시스템의 메모리 접근 패턴 , CPU 캐시 최적화를 고려할때 배열을 사용하는 ArrayDeque가 훨씬 빠르다.
        Deque<Integer> deque = new ArrayDeque<>();
        // Deque<Integer> deque1 = new LinkedList<>();

        deque.offerFirst(1);
        System.out.println("deque = " + deque);
        deque.offerFirst(2);
        System.out.println("deque = " + deque);

        deque.offerLast(3);
        System.out.println("deque = " + deque);
        deque.offerLast(4);
        System.out.println("deque = " + deque);

        // 꺼내지 않고 단순 조회만.
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast());
    }

}
