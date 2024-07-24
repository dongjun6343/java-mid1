package mid1.collection.set.test;

import java.util.*;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));
        for (Integer e : set) {
            System.out.println("e = " + e);
//            e = 10
//            e = 20
//            e = 30
        }
    }
}
