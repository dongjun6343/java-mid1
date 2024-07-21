package mid1.generic.ex3.unit;

public class UnitUtil {

    // 1. 유닛을 반환
    // 2. 입력 , 반환의 유닛의 타입이 같아야 한다.
    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        if (t1.getHp() > t2.getHp()) {
            return t1;
        } else {
            return t2;
        }
    }
}
