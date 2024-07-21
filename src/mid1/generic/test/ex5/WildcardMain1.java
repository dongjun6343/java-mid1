package mid1.generic.test.ex5;

import mid1.generic.animal.Animal;
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

        Dog dog = WildCardEx.<Dog>printAndReturn(dogBox);

        catBox.setValue(new Cat("냐옹이", 200));
        Cat cat = WildCardEx.<Cat>printAndReturn(catBox);


        // 와일드카드는 반환 타입을 동적으로 바꿀 수 없다. 가져다 쓰는 개념이기 때문에!!
        Animal animal = WildCardEx.printAndReturnWildcard(dogBox);

        // 제네릭 타입이나 제네릭 메서드가 꼭 필요한 상황이면 <T>
        // 그렇지 않으면 와일드카드를 사용하자!


    }
}
