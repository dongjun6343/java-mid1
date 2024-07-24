package mid1.collection.list.array.test.ex1;

/**
 * 이론상 추가, 삭제는 연결 리스트가 좋다고 생각이 들지만,
 * 실제 확인해보면 배열 리스트가 성능이 좋다.
 * <p>
 * 데이터가 엄청 많을 경우 데이터를 앞에서 추가 삭제할때만 연결 리스트가 좋다.(나머지는 배열 리스트 성능이 좋음)
 * 따라서 실무에서는 배열 리스트를 많이(거의 대부분) 사용한다.
 */
public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
