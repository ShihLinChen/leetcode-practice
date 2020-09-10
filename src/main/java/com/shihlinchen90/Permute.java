package com.shihlinchen90;

import java.util.Arrays;

public class Permute {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        permute(a, 0);
    }

    public static void permute(int[] intArray, int start) {
        // start：每次在湊出不重複排列時，當下要固定下來的數字的 index

        /* 一開始做 SWAP，把 start 和 i 這兩個 index 裡面的內容互換，做完
        permute() 後要還原，所以在做一次 SWAP */

        for (int i = start; i < intArray.length; i++) {
            int temp = intArray[start];
            intArray[start] = intArray[i];
            intArray[i] = temp;
            permute(intArray, start + 1);
            intArray[i] = intArray[start];
            intArray[start] = temp;
        }

        if (start == intArray.length) {
            System.out.println(Arrays.toString(intArray));
        }

    }
}
