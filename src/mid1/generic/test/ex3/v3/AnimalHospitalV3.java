package mid1.generic.test.ex3.v3;

import mid1.generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에서는 알 수 없다. Object 기능만 사용 가능!
        // -> T extends Animal ->  Animal의 기능을 쓸 수 있게 된다.
        System.out.println("animal.getName = " + animal.getName());
        System.out.println("animal.getSize = " + animal.getSize());
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
