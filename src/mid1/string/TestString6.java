package mid1.string;

public class TestString6 {
    public static void main(String[] args) {

        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int idx = str.indexOf(key);
        System.out.println("idx = " + idx);
        while (idx >= 0) {
            idx = str.indexOf(key, idx + 1);
            count++;
        }
        System.out.println("count = " + count);
    }
}
