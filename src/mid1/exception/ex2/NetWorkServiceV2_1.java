package mid1.exception.ex2;

public class NetWorkServiceV2_1 {

    public void sendMessage(String message) throws NetworkClientExceptionV3 {
        String address = "http://example.com";
        NetWorkClientV3 client = new NetWorkClientV3(address);

        client.initError(message); // 추가

        client.connect();
        client.send(message);
        client.disconnect();
    }
}
