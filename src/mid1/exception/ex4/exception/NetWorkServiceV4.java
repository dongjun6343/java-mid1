package mid1.exception.ex4.exception;


import mid1.exception.ex4.NetWorkClientV4;

public class NetWorkServiceV4 {

    public void sendMessage(String message) {
        String address = "http://example.com";
        NetWorkClientV4 client = new NetWorkClientV4(address);

        client.initError(message); // 추가

        try {
            // 정상 흐름
            client.connect();
            client.send(message);
        } finally {
            client.disconnect();
        }
    }
}