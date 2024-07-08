package mid1.exception.ex2;

public class NetWorkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetWorkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공!!");
        // return "success"; 리턴값도 필요없어짐 -> 예외처리가 되지 않았다면 정상처리이므로
    }

    public void send(String message) throws NetworkClientExceptionV2 {

        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패 ");
        }
        System.out.println(address + " 서버에 데이터 전송 : " + message);
        // return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제!!");
    }

    public void initError(String message) {
        if (message.contains("error1")) {
            connectError = true;
        }

        if (message.contains("error2")) {
            sendError = true;
        }
    }
}

