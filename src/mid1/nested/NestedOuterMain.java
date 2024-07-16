package mid1.nested;

/**
 * 정적 중첩 클래스는 사실 다른 클래스를 그냥 중첩해 둔 것 뿐이다.
 * 그냥 클래스 2개를 따로 만든것과 같다.
 * 유일한 차이는 private 접근 제어자에 접근할 수 있다는 정도이다.
 */

public class NestedOuterMain {
    public static void main(String[] args) {

        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nested Class = " + nested.getClass());
    }
}
