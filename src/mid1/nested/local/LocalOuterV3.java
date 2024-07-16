package mid1.nested.local;

/**
 * 변수의 생명주기
 * 클래스 변수 : 프로그램 종료까지 (메서드 영역) - 클래스 변수(static 변수)는 메서드 영역에 존재.
 * 인스턴스 변수 - 인스턴스가 GC되기 전까지 존재.(힙 영역)
 * 지역 변수 - 메서드 호출이 끝나면 사라짐, 매개변수도 지역변수의 한 종류이다. (스택 영역)
 */
public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1; // 지역 변수는 스택 프레임이 종료되면 함께 제거된다.

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
        // printer.print(); 여기서 반환하지 않고 Printer 인스턴스만 반환한다.
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV3 = new LocalOuterV3();
        Printer printer = localOuterV3.process(2);
        printer.print(); // 지역 변수 캡처 ( 자바는 접근이 필요한 지역 변수만 캡처한다.)
    }
}
