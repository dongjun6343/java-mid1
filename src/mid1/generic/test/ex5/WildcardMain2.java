package mid1.generic.test.ex5;

import mid1.generic.animal.Animal;
import mid1.generic.animal.Cat;
import mid1.generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // animal 포함 상위 타입 전달 가능
        writeBox(objectBox);
        writeBox(animalBox);

//        writeBox(dogBox); // 하한이 Animal
//        writeBox(catBox); // 하한이 Animal

        Animal animal = animalBox.getValue();
        System.out.println("animal = " + animal);
    }

    // <? super Animal> : animal 상한만 가능하다.
    static void writeBox(Box<? super Animal> box) {
        box.setValue(new Dog("멍멍이", 100));

    }
}
