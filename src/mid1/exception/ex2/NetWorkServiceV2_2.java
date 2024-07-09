package mid1.exception.ex2;

public class NetWorkServiceV2_2 {

    public void sendMessage(String message) {
        String address = "http://example.com";
        NetWorkClientV3 client = new NetWorkClientV3(address);

        client.initError(message); // 추가

        try {
            client.connect();
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + " : " + e.getMessage());
            return;
        }

        try {
            client.send(message);
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + " : " + e.getMessage());
            return;
        }
        client.disconnect();
    }
}
