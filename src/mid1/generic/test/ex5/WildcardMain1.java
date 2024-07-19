package mid1.generic.test.ex5;

import mid1.generic.animal.Cat;
import mid1.generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.setValue(new Dog("멍멍이", 100));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printGenericV2(dogBox);
        Dog dog = WildCardEx.printAndReturn(dogBox);


    }
}
