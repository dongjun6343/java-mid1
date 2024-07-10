package mid1.exception.ex4;


import mid1.exception.ex4.exception.NetWorkServiceV4;
import mid1.exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {

        NetWorkServiceV4 netWorkService = new NetWorkServiceV4();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            try {
                netWorkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 없는 에러가 발생했습니다."); // 사용자 입장에서는 정확한 에러가 뭔지 알 필요는 없다.
        System.out.println("==== 개발자용 디버깅 메시지 ====");
        e.printStackTrace(System.out);

        // 필요하면 예외 별로 별도의 추가 처리 기능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }
    }
}
