package mid1.nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();

        // 인스턴스에 접근할 수 있다. => outer.new Inner();
        InnerOuter.Inner inner = outer.new Inner(); // 바깥 인스턴스가 있어야 한다.
    }
}
