package mid1.exception.ex2;

public class NetWorkServiceV3 {

    public void sendMessage(String message) {
        String address = "http://example.com";
        NetWorkClientV3 client = new NetWorkClientV3(address);

        client.initError(message); // 추가

        try {
            // 정상 흐름
            client.connect();
            client.send(message);
        } catch (NetworkClientExceptionV3 e) {
            // 예외 흐름
            System.out.println("[오류] 코드 : " + e.getErrorCode() + " : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
