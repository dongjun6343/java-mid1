package mid1.nested;

public class ShdowingMain {
    
    public int value = 1;
    
    class Inner{
        public int value = 2;
        
        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShdowingMain.this.value = " + ShdowingMain.this.value);
        }
    }

    // 변수의 이름이 같을 경우 더 구체적인 것이 우선권을 가진다.
    public static void main(String[] args) {
        ShdowingMain shdowingMain = new ShdowingMain();
        Inner inner = shdowingMain.new Inner();
        inner.go();
    }
}
