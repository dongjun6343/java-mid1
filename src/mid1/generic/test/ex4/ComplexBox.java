package mid1.generic.test.ex4;

import mid1.generic.animal.Animal;

public class ComplexBox <T extends Animal> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    // 제네릭 메서드가 우선순위
    public <T> T printAndReturn(T t) {
        System.out.println("animal.getClass().getName() = " + animal.getClass().getName());
        System.out.println("z.getClass().getName() = " + t.getClass().getName());
        return t;
    }
}
