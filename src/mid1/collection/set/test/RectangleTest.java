package mid1.collection.set.test;

import java.util.HashSet;

public class RectangleTest {

    public static void main(String[] args) {
        HashSet<Rectangle> rectangleSet = new HashSet<>();
        rectangleSet.add(new Rectangle(10, 10));
        rectangleSet.add(new Rectangle(20, 20));
        rectangleSet.add(new Rectangle(20, 20)); // 중복

         //해시 알고리즘을 사용하므로 equalsAndHashCode 재정의를 해야한다.
        /**
         *     @Override
         *     public boolean equals(Object object) {
         *         if (this == object) return true;
         *         if (object == null || getClass() != object.getClass()) return false;
         *         Rectangle rectangle = (Rectangle) object;
         *         return width == rectangle.width && height == rectangle.height;
         *     }
         *
         *     @Override
         *     public int hashCode() {
         *         return Objects.hash(width, height);
         *     }
         */
        for (Rectangle rectangle : rectangleSet) {
            System.out.println("rectangle = " + rectangle);
        }
    }
}
