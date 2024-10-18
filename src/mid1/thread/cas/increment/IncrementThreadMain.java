package mid1.thread.cas.increment;

import java.util.ArrayList;
import java.util.List;

public class IncrementThreadMain {

    public static final int THREAD_COUNT = 1000;

    public static void main(String[] args) {
        test(new BasicInteger());
        test(new VolatileInteger());
        test(new MyAtomicInteger());
    }

    private static void test(IncrementInteger incrementInteger) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                    incrementInteger.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        int result = incrementInteger.get();
        System.out.println(incrementInteger.getClass().getSimpleName() + "result = " + result);

        /**
         * 1000보다 더 적은 숫자가 나온다.
         * 여러 스레드가 원자적이지 않은 value++을 호출했기 때문에.
         */
    }
}
