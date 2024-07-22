package mid1.collection.array;


public class MyArrayListV2Main {

    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();
        System.out.println("== 데이터 추가 ==");
        System.out.println("list = " + list);
        list.add("a");
        System.out.println("list = " + list);
        list.add("a");
        System.out.println("list = " + list);
        list.add("c");
        System.out.println("list = " + list);

        System.out.println("== 기능 사용 ==");
        System.out.println(list.size());
        System.out.println("list.get(1) = " + list.get(1));

        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
        System.out.println("list.set(1, \"z\") = " + list.set(1, "z"));

        System.out.println("== 범위 초과 ==");

        //list = [a, z, c, d, e] size=5, capacity=5
        //list = [a, z, c, d, e, g] size=6, capacity=10

        list.add("d");
        System.out.println("list = " + list);
        list.add("e");
        System.out.println("list = " + list);

        list.add("g");
        System.out.println("list = " + list);
    }
}
