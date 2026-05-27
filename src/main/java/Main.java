import arrays.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] num = {7, 9, 3, 4, 5, 1, 2, 6};
        Arrays arrays = new Arrays();

//        int[] result = arrays.reverseAnArray(num);
//        System.out.println(java.util.Arrays.toString(result));
//        arrays.maxAndMinIntegers();
        int[] nums = {1, 4, 3};
        int [] result = arrays.concatWithReverse(nums);
        System.out.println(java.util.Arrays.toString(result));
//
//        System.out.println(arrays.secondLargestElement(nums));
//        arrays.removeDuplicate();
    }
}
