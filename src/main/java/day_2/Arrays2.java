package day_2;

public class Arrays2 {

    public Integer findMaxElement(int[] arr) {
        int maxValue = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        return maxValue;
    }

    public Integer occurranceCount(int[] arr, int target) {
        int count = 0;

        for (int num : arr) {
            if (num == target) count++;
        }

        return count;
    }

    public int[] replaceNegativeWithZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = 0;
        }

        return arr;
    }
}
