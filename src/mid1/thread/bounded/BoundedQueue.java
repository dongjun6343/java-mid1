package mid1.thread.bounded;

public interface BoundedQueue {
    void put(String data);

    String take();
}
