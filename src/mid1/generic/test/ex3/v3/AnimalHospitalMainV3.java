package mid1.generic.test.ex3.v3;

import mid1.generic.animal.Cat;
import mid1.generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {

        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();
        // AnimalHospitalV3<Integer> integerAnimalHospitalV3 = new AnimalHospitalV3<>();  // error!!

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();

        // 문제 1 : 개 병원에 고양이 전달 -> 해결
        // dogHospital.setAnimal(cat);

        // 문제 2 : 개 타입 반환 -> 해결
        dogHospital.setAnimal(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 300));

        System.out.println("biggerDog = " + biggerDog);
    }
}
