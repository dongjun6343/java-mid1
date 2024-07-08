package mid1.exception.ex2;

public class NetWorkServiceV2_1 {

    public void sendMessage(String message) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetWorkClientV2 client = new NetWorkClientV2(address);

        client.initError(message); // 추가

        client.connect();
        client.send(message);
        client.disconnect();
    }
}
