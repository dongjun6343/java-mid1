package mid1.file.text;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Files로 문자 파일 읽기
 *
 *  - Files를 쓰면 아주 쉽게 읽고 쓰기가 가능하다.
 */
public class ReadTextFileV1 {

    private static final String PATH = "temp/hello2.txt";

    public static void main(String[] args) throws IOException {
        String writeString = "abc\n가나다";
        System.out.println("=== Write Text ===");
        System.out.println(writeString);

        Path path = Path.of(PATH);

        // 파일에서 쓰기
        Files.writeString(path, writeString, StandardCharsets.UTF_8);

        // 파일에서 읽기
        String readString = Files.readString(path, StandardCharsets.UTF_8);

        System.out.println("=== Read Text ===");
        System.out.println(readString);
    }
}
