package mid1.generic.test.ex3.v0;

import mid1.generic.animal.Cat;

public class CatHospital {

    private Cat animal;

    public void setAnimal(Cat animal) {
        this.animal = animal;
    }


    public void checkup() {
        System.out.println("animal.getName = " + animal.getName());
        System.out.println("animal.getSize = " + animal.getSize());
    }

    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
