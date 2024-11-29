package mid1.file.copy;

import java.io.*;

public class FileCopyV1 {
    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("temp/copy.dat");
        FileOutputStream fos = new FileOutputStream("temp/copy_new.dat");

        byte[] bytes = fis.readAllBytes();
        fos.write(bytes);

        fis.close();
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken = " + (endTime - startTime) + " ms");

    }
}
