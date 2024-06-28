package mid1.immutable;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate myDate1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate myDate2 = myDate1;

        System.out.println("myDate1 = " + myDate1);
        System.out.println("myDate2 = " + myDate2);

        System.out.println("2025 -> myDate1");
//        myDate1.setYear(2025); //컴파일 에러 발생

        // 불변 객체는 항상 리턴값(반환값)을 받자!
        myDate1= myDate1.withYear(2025);
        System.out.println("myDate1 = " + myDate1);
        System.out.println("myDate2 = " + myDate2);
    }
}
