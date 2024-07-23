package mid1.collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    /**
     * 배열을 사용한 리스트인 ArrayList는 단점이 있다
     * - 정확한 크기를 알지 못하면 메모리 낭비가 된다.
     * - 데이터를 앞이나 중간에 추가하거나 삭제할때 비효율적이다.
     *
     * -> 이러한 단점을 해결한 자료구조 -> 링크드 리스트(LinkedList)
     */

    public static void main(String[] args) {
        int[] arr = new int[5];

        // index 입력 : 빅오 O(1)
        System.out.println("index 입력");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(Arrays.toString(arr));

        // index 변경
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        // index 조회
        System.out.println("arr[2] = " + arr[2]);

        // 배열 검색
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            if (arr[i] == value) {
                System.out.println("value = " + value);
                break;
            }
        }
    }
}
