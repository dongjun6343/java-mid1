package mid1.thread.sync.test;

public class SyncTest2Main {

    public static void main(String[] args) throws InterruptedException {
        MyCounter counter = new MyCounter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                counter.count();
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

    }

    static class MyCounter {

        public void count() {
            int localValue = 0;
            for (int i = 0; i < 10000; i++) {
                localValue = localValue + 1;
            }
            System.out.println("결과 = " + localValue);
        }
    }

    /**
     * 왜 지역 변수는 동기화에 대한 걱정을 안해도 될까?
     * 지역 변수는 스레드의 개별 저장 공간인 스택 영역에 생성된다.
     *  => 변수 이름만 같은것뿐이지, 다른 localValue이다.
     *
     * [정리] 따라서 지역 변수는 절대로 다른 스레드와 공유되지 않는다.
     */
}
