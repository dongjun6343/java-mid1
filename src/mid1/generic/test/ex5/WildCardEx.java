package mid1.generic.test.ex5;

import mid1.generic.animal.Animal;

public class WildCardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.getValue());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.getValue();
        System.out.println("이름 = " + t.getName());
    }

    static <T extends Animal> T printAndReturn(Box<T> box) {
        T t = box.getValue();
        System.out.println("이름 = " + t.getName());
        return t;
    }
    
    // 와일드 카드 사용
    // 와일드 카드는 제네릭 타입을 편하게 활용할때 사용한다.
    // ? : Box<Dog> , Box<Cat> , Box<Object>
    static void printWildCard(Box<?> box) {
        System.out.println("? = " + box.getValue());
    }

    static void printWildCardV2(Box<? extends Animal> box) {
        Animal animal = box.getValue();
        System.out.println("? = " + animal.getName());
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.getValue();
        System.out.println("? = " + animal.getName());
        return animal;
    }

}
