package mid1.exception.ex0;

/**
 * main -> NetworkService -> NetWorkClient (conn , send, disconn)
 */
public class NetWorkServiceV0 {

    public void sendMessage(String message) {
        String address = "http://example.com";
        NetWorkClientV0 client = new NetWorkClientV0(address);

        client.connect();
        client.send(message);
        client.disconnect();
    }

}
