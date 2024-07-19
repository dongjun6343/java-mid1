package mid1.generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object object) {
        System.out.println("object = " + object);
        return object;
    }


    // 반환타입 앞에 <> -> 제네릭 메서드
    public static <T> T genericMethod(T t) {
        System.out.println("print = " + t);
        return t;
    }

    // 타입에 제한을 둘 수 있다.
    public static <T extends Number> T genericNumberMethod(T t) {
        System.out.println("print = " + t);
        return t;
    }
}
