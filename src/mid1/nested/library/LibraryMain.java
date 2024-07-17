package mid1.nested.library;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(2);

        library.addBook("책1", "저자1");
        library.addBook("책2", "저자2");
        library.addBook("책3", "저자3");

        library.showBooks(); // 도서관의 모든 도서 출력
    }
}
