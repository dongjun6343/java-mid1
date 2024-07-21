package mid1.generic.ex3.unit;

public class UnitPrinter {

    // 제네릭
    public static<T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("unit = " + unit.getHp() + unit.getName());
    }

    // 와일드 카드
    public static void printV2(Shuttle<? extends BioUnit> t1) {
        BioUnit unit = t1.out();
        System.out.println("unit = " + unit.getHp() + unit.getName());
    }
}
