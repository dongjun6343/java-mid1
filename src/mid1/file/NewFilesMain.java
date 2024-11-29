package mid1.file;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;


/**
 * 1.0 File 클래스 등장 -> 1.7 Files와 Path 등장
 *
 * Files의 특징
 * 성능과 편의성 모두 개선
 * File은 호환성 때문에 남겨둔 기능이다. Files 사용을 먼저 고려하자.
 * Files을 사용할때 파일이나 디렉토리의 경로는 Path클래스를 사용해야 한다.
 */
public class NewFilesMain {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("temp/example.txt");
        Path directory = Path.of("temp/exampleDir");

        System.out.println("Files.exists(file) = " + Files.exists(file));

        try {
            Files.createFile(file);
            System.out.println("File created");
        } catch (FileAlreadyExistsException e) {
            System.out.println(file + " File already exists");
        }

        try {
            Files.createDirectory(directory);
        } catch (FileAlreadyExistsException e) {
            System.out.println(directory + " Directory already exists");
        }

//        Files.delete(file);
//        System.out.println("Files.delete");

        System.out.println("Files.isRegularFile(file) = " + Files.isRegularFile(file));
        System.out.println("Files.isDirectory(directory) = " + Files.isDirectory(directory));
        System.out.println("file.getFileName() = " + file.getFileName());
        System.out.println("Files.size(file) = " + Files.size(file) + " bytes");

        Path newFile = Path.of("temp/newExample.txt");
        Files.move(file, newFile, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("Files.getLastModifiedTime(newFile) = " + Files.getLastModifiedTime(newFile));

        BasicFileAttributes attributes = Files.readAttributes(newFile, BasicFileAttributes.class);
        System.out.println("attributes.isSymbolicLink() = " + attributes.isSymbolicLink());

    }
}
