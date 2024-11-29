package mid1.file.text;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class ReadTextFileV2 {

    private static final String PATH = "temp/hello2.txt";

    public static void main(String[] args) throws IOException {
        String writeString = "abc\n가나다";
        System.out.println("=== Write Text ===");
        System.out.println(writeString);

        Path path = Path.of(PATH);

        // 파일에서 쓰기
        Files.writeString(path, writeString, StandardCharsets.UTF_8);

        // 파일에서 읽기
        System.out.println("=== Read Text ===");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ": " + lines.get(i));
        }

        //백만줄이 있다면? readAllLines : 리스트에 백만건을 한 메모리에 올리고 한줄씩 올린다. => OOM 발생가능

        System.out.println("=========== linesLambda ===========");
        Stream<String> linesLambda = Files.lines(path, StandardCharsets.UTF_8);

        linesLambda.forEach(line -> System.out.println(line)); // 한줄씩 처리 => 메모리 사용량을 줄일 수 있다.

        linesLambda.close();

    }
}
