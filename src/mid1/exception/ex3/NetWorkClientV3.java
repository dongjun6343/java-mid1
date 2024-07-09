package mid1.exception.ex3;


import mid1.exception.ex3.exception.ConnectExceptionV3;
import mid1.exception.ex3.exception.SendExceptionV3;

public class NetWorkClientV3 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetWorkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 {
        if (connectError) {
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공!!");
    }

    public void send(String message) throws SendExceptionV3 {

        if (sendError) {
            throw new SendExceptionV3(message, address + " 서버에 데이터 전송 실패 " + message);

        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + message);
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

