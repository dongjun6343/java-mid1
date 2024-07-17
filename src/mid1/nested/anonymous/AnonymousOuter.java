package mid1.nested.anonymous;

import mid1.nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int localVar = 1;

        // 익명클래스는 부모 클래스를 상속 받거나 또는 인터페이스를 구현해야 한다.
        // 익명클래스는 이름이 없는 지역 클래스이다.
        // 복잡하거나 재사용성이 있으면 클래스로 빼는게 좋다.
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
