package mid1.collection.set.test;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 합집합, 교집합, 차집합 구하기.
public class setTest {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>(set1);

        union.addAll(set1);
        union.addAll(set2);

        System.out.println("합집합 = " + union);

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합 = " + intersection); // 3, 4, 5 .. 겹치는 값만.

        Set<Integer> difference = new HashSet<>(set1); // set1 - set2
        difference.removeAll(set2);
        System.out.println("차집합 = " + difference);
    }
}
