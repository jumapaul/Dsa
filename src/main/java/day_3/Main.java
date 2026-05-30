package day_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] result = rotateArray(3, nums);
        System.out.println(Arrays.toString(result));
    }

    //    Given an integer array nums, rotate the array to the right by k steps.
//            Example:
//    Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3
//    Output: [5, 6, 7, 1, 2, 3, 4]
//    [ 5, 6, 7, 1, 2, 3, ,]
//    Constraints:
//            - Try to do it in O(1) extra space (in-place)
//            - k can be larger than array length
    public static int[] rotateArray(int k, int[] nums) {

        int length = nums.length;

        if (k > length || k == length) {
            reverse(nums, 0, length - 1);
        } else {
            int majorLeft = length - k;
            int majorRight = length - 1;

            int minorLeft = 0;
            int minorRight = length - k - 1;

            reverse(nums, majorLeft, majorRight); //Reverse the defined area
            reverse(nums, minorLeft, minorRight); //reverse the remaining area
            reverse(nums, 0, length - 1);
        }

        return nums;
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int current = nums[left];
            nums[left] = nums[right];
            nums[right] = current;
            left++;
            right--;
        }
    }
}
