package mid1.thread.sync.test;

public class Immutable {

    private final int value;

    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

/**
 * value 필드(멤버 변수)는 공유되는 값이다. 멀티스레드 시 문제가 될까?
 * 쓰레드가 공유 자원에 접근은 문제가 안된다. 하지만, 공유 자원을 사용하는 중간에 다른 스레드가 공유 자원의 값을 바꾸는것이 문제다!
 *
 * 필드에 final이 붙었으므로, 어떤 스레드도 값을 변경할 수 없기 때문에 문제 없는 안전한 공유 자원이 된다.
 *
 */