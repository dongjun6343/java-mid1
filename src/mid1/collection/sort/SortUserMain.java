package mid1.collection.sort;

import java.util.Arrays;

public class SortUserMain {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] array = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        // 기본 정렬 
        Arrays.sort(array);

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        // id 정렬
        Arrays.sort(array, new IdComparator());
        System.out.println("Arrays.IdComparator = " + Arrays.toString(array));

        Arrays.sort(array, new IdComparator().reversed());
        System.out.println("Arrays.IdComparator.reversed = " + Arrays.toString(array));
    }
}
