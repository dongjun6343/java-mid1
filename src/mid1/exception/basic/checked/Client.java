package mid1.exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException {

        // 문제 상황 발생
        // throws MyCheckedException - 예외 던지기
        throw new MyCheckedException("ex");
    }
}
