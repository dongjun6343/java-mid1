package mid1.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        process.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        // 익명 클래스 참조 바로 전달!
        // 코드 조각을 전달하기 위해 이런식으로 메서드를 만들고 인스턴스를 넘겨야할까??? 너무 복잡하다. -> 람다 - 메서드(함수)를 인수로 전달할 수 있다.
        hello(new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });

        hello(new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}
