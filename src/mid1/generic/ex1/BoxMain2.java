package mid1.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello");
        String string = (String) stringBox.get();
        System.out.println("string = " + string);

        // 문제
        // 1. 실수로 integerBox에 문자를 넣는다. -> ClassCastException (캐스팅 예외 발생)
        // 2. 반환 타입이 맞지 않은 문제 -> 반환타입이 무조건 Object다.
        integerBox.set("문자100");

        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);

        // 다형성을 활용해서 코드의 중복을 제거하고 재사용할 수 있게 되었지만,
        // 타입 안전성 문제가 발생했다.
    }
}
