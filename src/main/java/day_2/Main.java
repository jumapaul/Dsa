package day_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Arrays2 arrays2 = new Arrays2();

        int[] arr = {-3, 5, -1, 7, -8, 2, -4};
        System.out.println(Arrays.toString(arrays2.replaceNegativeWithZeros(arr)));
    }
}
