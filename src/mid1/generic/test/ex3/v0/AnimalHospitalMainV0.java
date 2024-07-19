package mid1.generic.test.ex3.v0;

import mid1.generic.animal.Cat;
import mid1.generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();

        // 문제 1 : 개 병원에 고양이 전달
        // dogHospital.setAnimal(cat); 다른 타입을 입력하면 컴파일 오류

        // 문제 2 : 개 타입 반환
        dogHospital.setAnimal(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 300));

        System.out.println("biggerDog = " + biggerDog);

        // 코드 재사용 X
        // 타입 안정성 O
    }
}
