package mid1.file.copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopyV3 {
    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();

        // V1, V2는 파일을 복사할때
        // 파일(copy.dat) -> 자바(byte) -> 파일(copy_new.dat)의 과정을 거쳤다.

        // V3는 파일을 복사할때
        // 운영체제의 파일 복사 기능을 사용한다.
        // 파일(copy.dat) -> 파일(copy_new.dat)
        // 하지만, 해당 기능을 파일을 복사할때만 유용하다.
        // 파일의 정보를 읽거나 스트림을 통해 네트워크를 전달해야 한다면, 앞서 설명한 스트림을 직접 사용해야 한다.
        Path source = Path.of("temp/copy.dat");
        Path target = Path.of("temp/copy_new.dat");


        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken = " + (endTime - startTime) + " ms");

    }
}
