package mid1.string;

public class TestString5 {
    public static void main(String[] args) {

        String str = "hello.txt";
        String ext = ".txt";

        int idx = str.indexOf(ext);
        String fileName = str.substring(0, idx);
        String extName = str.substring(idx);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);

    }
}
