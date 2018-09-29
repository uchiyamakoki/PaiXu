package cn.string.day13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo22 {
    public static void main(String[] args) {
        int[] arr={24,69,80,57,13};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);


        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,57));

    }
}
