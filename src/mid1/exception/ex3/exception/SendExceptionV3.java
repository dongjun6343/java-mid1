package mid1.exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3 {

    public String getSendData() {
        return sendData;
    }

    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }
}
