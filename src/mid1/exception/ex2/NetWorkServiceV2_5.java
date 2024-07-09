package mid1.exception.ex2;

public class NetWorkServiceV2_5 {

    public void sendMessage(String message) {
        String address = "http://example.com";
        NetWorkClientV2 client = new NetWorkClientV2(address);

        client.initError(message); // 추가

        try {
            // 정상 흐름
            client.connect();
            client.send(message);
        } catch (NetworkClientExceptionV2 e) {
            // 예외 흐름
            System.out.println("[오류] 코드 : " + e.getErrorCode() + " : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
