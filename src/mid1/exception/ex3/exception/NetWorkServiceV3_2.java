package mid1.exception.ex3.exception;


import mid1.exception.ex3.NetWorkClientV3;

public class NetWorkServiceV3_2 {

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
        } catch (NetworkClientExceptionV3 e) {
            // 나머지는 NetworkClientExceptionV3 (부모)가 다 잡겠다!
            System.out.println("[네트워크 오류] 메시지 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}