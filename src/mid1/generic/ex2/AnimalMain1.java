package mid1.generic.ex2;

import mid1.generic.animal.Animal;
import mid1.generic.animal.Cat;
import mid1.generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal 동물 = new Animal("동물", 0);

        Dog 개 = new Dog("개", 100);
        Cat 고양이 = new Cat("고양이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(개);
        Dog findDog = dogBox.get();
        System.out.println("findDog: " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(고양이);
        Cat findCat = catBox.get();
        System.out.println("findCat: " + findCat);

    }
}
