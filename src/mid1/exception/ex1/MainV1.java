package mid1.exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        // NetWorkServiceV1_1 netWorkService = new NetWorkServiceV1_1();
        // NetWorkServiceV1_2 netWorkService = new NetWorkServiceV1_2();
        NetWorkServiceV1_3 netWorkService = new NetWorkServiceV1_3();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }
            netWorkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
