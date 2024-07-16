package mid1.nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    // 내부 클래스는 앞에 static이 붙지 않는다. -> 인스턴스 멤버가 된다.
    // 내부 인스턴스는 바깥 인스턴스 참조를 보관한다.
    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            System.out.println("innerInstanceValue = " + innerInstanceValue);

            System.out.println("outInstanceValue = " + outInstanceValue);

            System.out.println("outClassValue = " + outClassValue);
        }
    }
}
