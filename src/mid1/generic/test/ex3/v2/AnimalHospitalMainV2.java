package mid1.generic.test.ex3.v2;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {

        // 문제. 아무 타입이나 다 들어올 수 있다.
        // 타입인자를 animal에 관련된 타입만 올 수 있도록 하면 되지 않을까? -> 제한, 한정 필요
        // -> 타입 매개변수 제한
        AnimalHospitalV2<Integer> integerAnimalHospitalV2 = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectAnimalHospitalV2 = new AnimalHospitalV2<>();

    }
}
