package mid1.exception.ex1;

/**
 * main -> NetworkService -> NetWorkClient (conn , send, disconn)
 */
public class NetWorkServiceV1_2 {

    public void sendMessage(String message) {
        String address = "http://example.com";
        NetWorkClientV1 client = new NetWorkClientV1(address);

        client.initError(message); // 추가

        String connectResult = client.connect();

        // 결과가 성공이 아니다 -> 오류다. !connectResult.equals("success") -> 리팩토링
        if (isError(connectResult)) {
            System.err.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            return;
        }

        String sendResult = client.send(message);
        if (isError(sendResult)) {
            System.err.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            return;
        }
        client.disconnect(); // todo 사용후에는 반드시 disconnect를 반드시 호출하도록 변경이 필요하다.
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }

}
