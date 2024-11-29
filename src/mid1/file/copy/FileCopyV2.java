package mid1.file.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyV2 {
    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("temp/copy.dat");
        FileOutputStream fos = new FileOutputStream("temp/copy_new.dat");

        fis.transferTo(fos); // inputStream에서 읽은 데이터를 바로 outputStream으로 출력!

//        byte[] bytes = fis.readAllBytes();
//        fos.write(bytes);

        fis.close();
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken = " + (endTime - startTime) + " ms");

    }
}
