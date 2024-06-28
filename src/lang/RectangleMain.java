package lang;


/**
 * 넓비와 높이가 같다면 동등성 비교에 성공해야한다.
 */
public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(100, 20);
        Rectangle rec2 = new Rectangle(100, 20);
        System.out.println("rec1 = " + rec1);
        System.out.println("rec2 = " + rec2);

        System.out.println(rec1 == rec2);
        System.out.println(rec1.equals(rec2));
    }


    static class Rectangle {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", height=" + height +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Rectangle rectangle = (Rectangle) o;
            return width == rectangle.width && height == rectangle.height;
        }
    }
}
