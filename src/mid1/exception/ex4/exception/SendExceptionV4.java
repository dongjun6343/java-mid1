package mid1.exception.ex4.exception;

public class SendExceptionV4 extends NetworkClientExceptionV4 {

    public String getSendData() {
        return sendData;
    }

    private final String sendData;

    public SendExceptionV4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }
}
