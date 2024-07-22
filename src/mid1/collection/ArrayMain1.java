package mid1.collection;

import java.util.Arrays;

public class ArrayMain1 {

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
