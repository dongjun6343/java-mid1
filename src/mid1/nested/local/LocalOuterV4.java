package mid1.nested.local;

/**
 * 변수의 생명주기
 * 클래스 변수 : 프로그램 종료까지 (메서드 영역) - 클래스 변수(static 변수)는 메서드 영역에 존재.
 * 인스턴스 변수 - 인스턴스가 GC되기 전까지 존재.(힙 영역)
 * 지역 변수 - 메서드 호출이 끝나면 사라짐, 매개변수도 지역변수의 한 종류이다. (스택 영역)
 *
 *
 * 캡처 변수
 * [정리] 지역 클래스가 접근하는 지역 변수의 값은 변경하면 안된다!
 */
public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1; // 지역 변수는 스택 프레임이 종료되면 함께 제거된다.
        // 지역변수는 중간에 값을 변경하지 못한다. ->  사살상 final.

        class LocalPrinter implements Printer {
            int value = 0;
//            int localVar = 1; 이런식으로 캡처
//            int paramVar = 2; 이런식으로 캡처 -> 해당 데이터를 가져온다.
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();

        // 만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??
        // localVar = 10; error
        // paramVar = 10; error

        // LocalPrinter printer = new LocalPrinter(); 해당 시점에 지역 변수를 캡처한다.
        // 스택 영역에 존재하는 지역 변수의 값과 인스턴스에 캡처한 캡처 변수의 값이 달라지는 문제 발생 !! -> 동기화 문제
        // [정리] : 지역 클래스가 접근하는 지역 변수의 값은 변경하면 안된다!
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV4 = new LocalOuterV4();
        Printer printer = localOuterV4.process(2);
        printer.print(); // 지역 변수 캡처 ( 자바는 접근이 필요한 지역 변수만 캡처한다.)
    }
}
