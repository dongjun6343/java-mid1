package mid1.collection.sort;

import java.util.TreeSet;

public class SortTreeMain {

    public static void main(String[] args) {

        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet = new TreeSet<>();
        treeSet.add(myUser1);
        treeSet.add(myUser2);
        treeSet.add(myUser3);
        System.out.println("treeSet = " + treeSet);


        TreeSet<MyUser> treeSet1 = new TreeSet<>(new IdComparator());
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);

        System.out.println("treeSet1 = " + treeSet1);


    }
}
