package mid1.exception.ex1;

/**
 * main -> NetworkService -> NetWorkClient (conn , send, disconn)
 */
public class NetWorkServiceV1_3 {

    public void sendMessage(String message) {
        String address = "http://example.com";
        NetWorkClientV1 client = new NetWorkClientV1(address);

        client.initError(message);

        String connectResult = client.connect();

        //todo 정상흐름과 예외흐름이 함께 있어서 보기 힘들다. -> 깔끔하게 바꿀 수 없을까??
        if (isError(connectResult)) {
            System.err.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        } else {
            String sendResult = client.send(message);
            if (isError(sendResult)) {
                System.err.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }
        client.disconnect(); // 무조건 disconnect 호출하도록 수정
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }

}
