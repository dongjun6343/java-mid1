package mid1.generic.test.ex3.v0;

import mid1.generic.animal.Dog;

public class DogHospital {

    private Dog animal;

    public void setAnimal(Dog animal) {
        this.animal = animal;
    }


    public void checkup() {
        System.out.println("animal.getName = " + animal.getName());
        System.out.println("animal.getSize = " + animal.getSize());
    }

    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
