package org.example;

import java.util.Random;

public class SearchComparison {

    public static void main(String[] args) {
        int size = 1_000_000;
        int[] sortedArray = new int[size];
        int[] unsortedArray = new int[size];

        for (int i = 0; i < size; i++) {
            sortedArray[i] = i;
        }

        Random rand = new Random();
        System.arraycopy(sortedArray, 0, unsortedArray, 0, size);
        for (int i = size - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[index];
            unsortedArray[index] = temp;
        }

        int target = size / 2;

        long startTimeBinary = System.nanoTime();
        int binarySearchResult = binarySearch(sortedArray, target);
        long endTimeBinary = System.nanoTime();
        long durationBinary = endTimeBinary - startTimeBinary;

        long startTimeLinear = System.nanoTime();
        int linearSearchResult = linearSearch(unsortedArray, target);
        long endTimeLinear = System.nanoTime();
        long durationLinear = endTimeLinear - startTimeLinear;

        System.out.println("Binary Search Result: " + binarySearchResult);
        System.out.println("Binary Search Time: " + durationBinary + " ns");

        System.out.println("Linear Search Result: " + linearSearchResult);
        System.out.println("Linear Search Time: " + durationLinear + " ns");
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

