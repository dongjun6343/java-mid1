package mid1.exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        NetWorkServiceV2_1 netWorkService = new NetWorkServiceV2_1();
//        NetWorkServiceV2_2 netWorkService = new NetWorkServiceV2_2();
//        NetWorkServiceV2_3 netWorkService = new NetWorkServiceV2_3();
        NetWorkServiceV2_4 netWorkService = new NetWorkServiceV2_4();

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

    // 예외 처리를 도입했지만, 아직 예외 복구가 되지 않는다.
    // -> 예외가 발생하면 프로그램이 종료된다. (사용 후 반드시 disconnect()호출해서 연결 해제해야 한다!!
}
