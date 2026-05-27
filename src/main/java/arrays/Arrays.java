package arrays;

import java.util.LinkedHashSet;

public class Arrays {

    public int[] reverseAnArray(int[] nums) {
        int n = 0;
        int length = nums.length;

        while (n < nums.length / 2) {
            int current = nums[n];
            nums[n] = nums[(nums.length - n) - 1];
            nums[length - 1] = current;
            n++;
            length--;
        }

        return nums;
    }

    public void maxAndMinIntegers() {
        int[] nums = {7, -3, 2, 9, -1, 6, -8, 4};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }

    public boolean isSorted(int[] nums) {
        //Whenever the next number in the array is less than the previous, return false
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public int secondLargestElement(int[] nums) {
        int largestValue = Math.max(nums[0], nums[1]);
        int secondLargest = Math.min(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > largestValue) {
                secondLargest = largestValue;
                largestValue = nums[i];
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest;
    }

    public int[] removeDuplicate(){
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        LinkedHashSet<Integer> exist = new LinkedHashSet<>();

        for (int i= 0; i<nums.length; i++){
            exist.add(nums[i]);
        }
        int i = 0;

        for (int num: exist){
            nums[i] = num;
            i++;
        }

        while (i<nums.length){
            nums[i] = -1;
            i++;
        }
        return nums;
    }

    public int[] concatWithReverse(int[] nums) {

        int[] newNum = new int[nums.length*2];

        int i = 0;

        for(int num: nums){
            newNum[i] = num;
            i++;
        }

        int newNumLength = newNum.length-1;
        for (int num: nums){
            newNum[newNumLength] = num;
            newNumLength--;
        }
        return newNum;
    }
}
