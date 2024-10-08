package mid1.thread.bounded;

import java.util.ArrayList;
import java.util.List;

public class BoundedMain {

    /**
     * 큐가 가득 차 있으면 버리게 된다.
     * - 데이터를 버리지 않은 대안?
     *  스레드가 기다리면 된다! => 기다리도록 구현해보자.(V2)
     *  나머지 모든 스레드가 BLOCKED 처리된다 => Object.wait() , Object.notify()를 사용해서 구현해보자! (V3)
     */
    public static void main(String[] args) {
        // 1. BoundedQueue 선택
//        BoundedQueue queue = new BoundedQueueV1(2);
//        BoundedQueue queue = new BoundedQueueV2(2);
        BoundedQueue queue = new BoundedQueueV3(2);

        // 2. 생산자, 소비자 실행 순서 선택, 반드시 하나만 선택!
        // 생산자 먼저 실행
         producerFirst(queue);
        // 소비자 먼저 실행
//        consumerFirst(queue);
    }

    private static void producerFirst(BoundedQueue queue) {
        System.out.println("[생성자 먼저 실행] >> " + queue.getClass().getSimpleName());
        List<Thread> threads = new ArrayList<>();
        startProducer(queue, threads);
        printAllStatus(queue, threads);
        startConsumer(queue, threads);
        printAllStatus(queue, threads);
        System.out.println("[생성자 먼저 실행 종료] >> " + queue.getClass().getSimpleName());
    }


    private static void startProducer(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        System.out.println("생산자 시작");
            try {
                for (int i = 0; i < 3; i++) {
                    Thread producer = new Thread(new ProducerTask(queue, "data" + i), "producer" + i);
                    threads.add(producer);
                    producer.start();
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    private static void startConsumer(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        System.out.println("소비자 시작");
        try {
            for (int i = 1; i <= 3; i++) {
                Thread consumer = new Thread(new ConsumerTask(queue), "consumer" + i);
                threads.add(consumer);
                consumer.start();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printAllStatus(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        System.out.println("현재 상태 출력, 큐 데이터 : " + queue);
        for (Thread thread : threads) {
            // 현재 스레드의 상태
            System.out.println(thread.getName() + ": " + thread.getState());
        }
    }

    private static void consumerFirst(BoundedQueue queue) {
        System.out.println("[소비자 먼저 실행] >> " + queue.getClass().getSimpleName());
        List<Thread> threads = new ArrayList<>();
        startConsumer(queue, threads);
        printAllStatus(queue, threads);
        startProducer(queue, threads);
        printAllStatus(queue, threads);
        System.out.println("[소비자 먼저 실행 종료] >> " + queue.getClass().getSimpleName());
    }
}
