package mid1.generic.ex2;

import mid1.generic.animal.Animal;
import mid1.generic.animal.Cat;
import mid1.generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal 동물 = new Animal("동물", 0);
        Dog 개 = new Dog("개", 100);
        Cat 고양이 = new Cat("고양이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(동물);
        animalBox.set(개);
        animalBox.set(고양이);


        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);

    }
}
