package mid1.generic.test.ex4;

import mid1.generic.animal.Cat;
import mid1.generic.animal.Dog;

public class GenericMethodMain3 {

    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("나옹이", 100);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.setAnimal(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
