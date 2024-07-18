package mid1.generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<>(); // 생성 시점에 T 타입 결정

        integerGenericBox.set(10);
//        integerGenericBox.set("문자100"); error
        Integer integer = integerGenericBox.get(); // 캐스팅 X
        System.out.println("integer = " + integer);


        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("Hello");
        String string = stringGenericBox.get();
        System.out.println("string = " + string);
    }
}
