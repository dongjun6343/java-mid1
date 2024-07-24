package mid1.collection.sort;

/**
 * Comparable , Comparator
 * 객체의 비교 기능
 */
public class MyUser implements Comparable<MyUser> {

    private String id;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MyUser(String id, int age) {
        this.age = age;
        this.id = id;
    }

    @Override
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
