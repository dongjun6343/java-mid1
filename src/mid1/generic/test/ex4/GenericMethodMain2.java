package mid1.generic.test.ex4;

import mid1.generic.animal.Cat;
import mid1.generic.animal.Dog;

public class GenericMethodMain2 {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("나옹이", 100);

        // 타입 매개변수 추론
//        AnimalMethod.<Dog>checkup(dog);
//        AnimalMethod.<Cat>checkup(cat);
        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        // AnimalMethod.<Dog>getBigger(dog, targetDog);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
