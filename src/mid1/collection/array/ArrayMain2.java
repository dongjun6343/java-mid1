package mid1.collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        System.out.println("arr = " + Arrays.toString(arr));

        // 배열의 첫번째 위치에 추가
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println("arr = " + Arrays.toString(arr));

        // index 위치에 추가
        int index = 2;
        int value = 4;
        addIndex(arr, index, value);
        System.out.println("arr = " + Arrays.toString(arr));

        // index 마지막 위치에 추가
        addLast(arr, 5);
    }

    private static void addLast(int[] arr, int newValue) {
        arr[arr.length - 1] = newValue;
    }

    private static void addIndex(int[] arr, int index, int value) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }

    private static void addFirst(int[] arr, int newValue) {
        // 3 2 1 0
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }
}
