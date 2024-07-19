package mid1.generic.test.ex3.v1;

import mid1.generic.animal.Animal;

public class AnimalHospitalV1 {

    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("animal.getName = " + animal.getName());
        System.out.println("animal.getSize = " + animal.getSize());
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
