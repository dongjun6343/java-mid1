package mid1.exception.ex1;

/**
 * main -> NetworkService -> NetWorkClient (conn , send, disconn)
 */
public class NetWorkServiceV1_1 {

    public void sendMessage(String message) {
        String address = "http://example.com";
        NetWorkClientV1 client = new NetWorkClientV1(address);

        client.initError(message); // 추가

        client.connect();
        client.send(message);
        client.disconnect();
    }

}
