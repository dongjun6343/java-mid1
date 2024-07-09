package mid1.exception.ex3;


import mid1.exception.ex3.exception.ConnectExceptionV3;
import mid1.exception.ex3.exception.SendExceptionV3;

public class NetWorkServiceV3_1 {

    public void sendMessage(String message) {
        String address = "http://example.com";
        NetWorkClientV3 client = new NetWorkClientV3(address);

        client.initError(message); // 추가

        try {
            // 정상 흐름
            client.connect();
            client.send(message);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터 : " + e.getSendData() + ", 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
