package mid1.collection.set.test;

import java.util.*;

public class UniqueNamesTest {

    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};

        // Set<Integer> set = new HashSet<>(List.of(inputArr));
        //List.of(inputArr) : 배열을 기반으로 리스트를 만듬.
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));
//        for (Integer e : inputArr) {
//            set.add(e);
//        }
        // List.of(inputArr)을 사용해서 위의 for문을 없앨 수 있다.

        List<Integer> inputArr1 = Arrays.asList(inputArr);
        List<Integer> inputArr2 = List.of(inputArr);
        // Arrays.asList()는 자바 1,2부터 존재, 자바9 이상을 사용한다면 List.of() 권장.

        for (Integer e : set) {
            System.out.println("e = " + e);
        }
    }
}
