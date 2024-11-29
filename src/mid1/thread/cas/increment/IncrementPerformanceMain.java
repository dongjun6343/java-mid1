package mid1.thread.cas.increment;

public class IncrementPerformanceMain {

    public static final long COUNT = 100_000_000;

    public static void main(String[] args) {
        test(new BasicInteger());
        test(new VolatileInteger());
        test(new MyAtomicInteger());
    }


    private static void test(IncrementInteger incrementInteger) {
        long startMs = System.currentTimeMillis();

        for (int i = 0; i < COUNT; i++) {
            incrementInteger.increment();
        }

        long endMs = System.currentTimeMillis();
        System.out.println(incrementInteger.getClass().getSimpleName() + " >>  ms : " + (endMs - startMs));
    }

    /**
     * 대부분 복잡한 동시성 라이브러리들은 CAS연산을 사용한다. AtomicInteger => CAS 연산을 사용
     */
}
