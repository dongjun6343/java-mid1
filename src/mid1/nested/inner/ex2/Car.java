package mid1.nested.inner.ex2;


/**
 * 내부클래스로 리팩토링
 */
public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    //Engine에서만 사용하는 메서드
//    public String getModel() {
//        return model;
//    }

    //Engine에서만 사용하는 메서드
//    public int getChargeLevel() {
//        return chargeLevel;
//    }

    // Car에서만 사용하므로 public -> private로 변경
    private class Engine {
        public void start() {
            System.out.println("충전 레벨 확인 : " + chargeLevel); // 직접 참조 가능 => 캡슐화.
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
