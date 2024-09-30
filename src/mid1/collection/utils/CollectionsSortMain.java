package mid1.collection.utils;

import java.util.Arrays;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {

        // 자바 1.2부터 존재
        Arrays.asList(1,2,3);

        // 자바 9
        List.of(1, 2, 3);

        // xxx.of(); => 불변으로 만듬.
        // add(), remove() 안된다. 조회만!

    }
}
