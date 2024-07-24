package mid1.collection.deque;

import java.util.Stack;

public class StackIntro {
    /**
     * push() 넣기 1, 2, 3
     * pop() 빼기 3, 2, 1
     *
     * LIFO(후입선출)
     */

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack = " + stack);

        // 꺼내지 않고 조회만
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        System.out.println("stack = " + stack.pop());

        /**
         * Stack 클래스를 사용하지 말자
         * Stack 클래스는 내부에서 Vector라는 자료구조를 사용.
         * 해당 자료구조는 자바1.0에 개발되었는데 지금은 사용되지 않고 하위 호환을 위해 존재한다.
         * 더 좋은 자료구조가 많으므로 사용하지 말자 -> Deque 사용하는 것이 좋다.
         */
    }
}
