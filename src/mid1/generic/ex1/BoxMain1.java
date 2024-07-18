package mid1.generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        System.out.println(integerBox.get());

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        System.out.println(stringBox.get());

        // 다형성을 사용해서 해결할 수 있지 않을까?
    }
}
