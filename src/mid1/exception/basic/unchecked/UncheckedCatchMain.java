package mid1.exception.basic.unchecked;


/**
 * 장점 : 신경쓰고 싶지 않은 언체크 예외를 무시할 수 있다.
 * 단점 : 언체크 예외는 개발자가 실수로 예외를 누락할 수 있다. ( 체크 예외는 컴파일러를 통해 예외 누락을 잡아준다.)
 *
 * -----------
 * 현대 개발에서는
 *  - 체크 예외를 거의 쓰지 않는다.
 */
public class UncheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
