package mid1.exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");

        /**
         * Exception in thread "main" mid1.exception.basic.checked.MyCheckedException: ex
         * 	at mid1.exception.basic.checked.Client.call(Client.java:8)
         * 	at mid1.exception.basic.checked.Service.catchThrow(Service.java:25)
         * 	at mid1.exception.basic.checked.CheckedThrowMain.main(CheckedThrowMain.java:6)
         *
         *
         *
         * 	System.out.println("정상 종료"); 를 출력하지 못함.
         * 	=> 예외가 main()밖으로 던져지면, 스택 트레이스를 출력하고 프로그램이 종료된다.
         */
    }
}
