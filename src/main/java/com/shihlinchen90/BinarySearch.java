package com.shihlinchen90;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {11, 33, 55, 77, 99, 111, 133, 155};

        System.out.println(binarySearch(a, 111));
        System.out.println(binarySearch(a, 22));
    }

    public static int binarySearch(int[] intArray, int target) {
        int low = 0;
        int high = intArray.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (intArray[middle] == target) {
                return middle;
            }
            if (intArray[middle] < target) {
                low = middle + 1;
            }
            if (intArray[middle] > target) {
                high = middle - 1;
            }
        }
        return -1;
    }
}
