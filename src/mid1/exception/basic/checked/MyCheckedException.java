package mid1.exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 *
 * 체크 예외의 장단점
 * 장점 : 개발자가 실수로 예외를 누락하지 않도록 컴파일러를 통해 문제를 잡아준다.
 * 단점 : 실제로는 개발자가 모든 예외를 잡거나 처리해줘야한다.
 *      -> 너무 번거로움. (크게 신경쓰고 싶지 않은 예외까지 모두 챙겨야 한다.)
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
