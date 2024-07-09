package mid1.exception.ex2;

public class NetWorkServiceV2_3 {

    public void sendMessage(String message) {
        String address = "http://example.com";
        NetWorkClientV3 client = new NetWorkClientV3(address);

        client.initError(message); // 추가

        try {
            // 정상 흐름
            client.connect();
            client.send(message);
            client.disconnect(); // [문제] 예외가 발생하면 disconnect 호출 되지 않음 -> 리소스 반환 X
        } catch (NetworkClientExceptionV3 e) {
            // 예외 흐름
            System.out.println("[오류] 코드 : " + e.getErrorCode() + " : " + e.getMessage());
        }
    }
}
