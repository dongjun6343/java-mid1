package mid1.generic.test.ex3.v1;

import mid1.generic.animal.Animal;
import mid1.generic.animal.Cat;
import mid1.generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {

        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();

        // 문제 1 : 개 병원에 고양이 전달
        dogHospital.setAnimal(cat); // 매개변수 체크 실패 => 컴파일 오류 발생하지 않음!!!

        // 문제 2 : 개 타입 반환
        dogHospital.setAnimal(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 300));

        System.out.println("biggerDog = " + biggerDog);

        // 코드 재사용 O -> 다형성을 이용
        // 타입 안정성 X -> 매개변수 체크 실패 => 컴파일 오류 발생하지 않음!!! , 캐스팅 에외가 발생할 수 있음.
    }
}
