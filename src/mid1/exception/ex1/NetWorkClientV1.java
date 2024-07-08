package mid1.exception.ex1;

public class NetWorkClientV1 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetWorkClientV1(String address) {
        this.address = address;
    }

    public String connect() {

        if (connectError) {
            System.err.println(address + " 서버 연결 실패 !!");
            return "connectError";
        }

        System.out.println(address + " 서버 연결 성공!!");
        return "success";
    }

    public String send(String message) {

        if (sendError) {
            System.err.println(address + " 서버에 데이터 전송 실패 : " + message);
            return "sendError";
        }
        System.out.println(address + " 서버에 데이터 전송 : " + message);
        return "success";
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

