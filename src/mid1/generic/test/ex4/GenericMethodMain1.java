package mid1.generic.test.ex4;

public class GenericMethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;

        Object object = GenericMethod.objMethod(i);
        System.out.println("object = " + object);

        // 타입 인자 명시적 전달
        System.out.println(" 타입 인자 명시적 전달 ");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);

        Integer number = GenericMethod.<Integer>genericNumberMethod(10);
        System.out.println("number = " + number);


        // 타입 추론
        System.out.println("타입 추론");

        Integer result2 = GenericMethod.genericMethod(i);
        System.out.println("result2 = " + result2);

        Integer number2 = GenericMethod.genericNumberMethod(10);
        System.out.println("number2 = " + number2);

        Double double2 = GenericMethod.genericNumberMethod(20.0);
        System.out.println("double2 = " + double2);

    }
}
