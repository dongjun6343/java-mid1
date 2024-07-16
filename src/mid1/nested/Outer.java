package mid1.nested;


/**
 * 용어 정리
 *  중첩 클래스 : 정적 중첩 클래스 + 내부 클래스 모두 포함
 *  정적 중첩 클래스
 *  내부 클래스 : 내부 클래스, 지역 클래스, 익명 클래스
 *
 *  중첩(Nested) vs 내부(Inner)
 *  정적 중첩 클래스는 바깥 클래스의 안에 있지만, 바깥 클래스와 관계 없는 전혀 다른 클래스
 *  내부 클래스는 바깥 클래스의 내부에 있으면서 바깥 클래스를 구성하는 요소
 *
 *  정리, 내부 클래스는 바깥 클래스의 인스턴스에 소속된다. 정적 중첩 클래스는 그렇지 않다.
 *
 *
 *  중첩 클래스는 언제 사용해야할까?
 *  - 둘이 아주 긴밀하게 연결되어 있거나 특별한 경우에만 사용
 *  - 외부의 여러 클래스가 특정 중첩 클래스를 사용한다면 중첩 클래스로 만들면 안된다.
 *
 *  중첩 클래스를 사용하는 이유
 *  - 논리적 그룹화, 캡슐화( 불필요한 public 메서드를 줄일 수 있다.)
 */

public class Outer {
    // ...

    // 정적 충첩 클래스
    static class StaticNested {
        //...
    }

    // 내부 클래스
    class Inner {
        // ...
    }

    public void process() {

        // 지역 변수
        int localVar = 0;

        // 지역 클래스 => 익명 클래스는 지역 클래스의 특별한 버전이다.
        class Local {
            // ...
        }

        Local local = new Local();
    }
}
