package mid1.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        // Stack -> Deque
        // Queue -> Deque
        // push, pop

        Deque<Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println("deque = " + deque);

        System.out.println("deque.peek() = " + deque.peek());
        System.out.println("deque.pop() = " + deque.pop());
    }
}
