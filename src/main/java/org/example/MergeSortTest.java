package org.example;

public class MergeSortTest {

    public static void main(String[] args) {
        // Example array to sort
        int[] arr = {
                874, 23, 987, 654, 234, 78, 349, 1054, 876, 123, 95, 756, 642, 39, 28, 93, 21, 543, 82, 654, 758,
                290, 19, 876, 245, 987, 345, 542, 1023, 56, 87, 77, 76, 542, 32, 876, 290, 540, 1234, 568, 234,
                657, 849, 1039, 29, 1038, 48, 756, 102, 907, 198, 564, 432, 609, 293, 82, 742, 458, 199, 750, 876,
                294, 758, 123, 457, 908, 298, 654, 387, 999, 112, 231, 456, 769, 554, 789, 430, 234, 543, 1092,
                876, 92, 290, 890, 438, 92, 999, 567, 785, 101, 654, 343, 1094, 295, 479, 1011, 324, 767, 432,
                654, 940, 567, 1002, 678, 567, 89, 999, 902, 187, 750, 543, 100, 1045, 209, 876, 482, 593, 987,
                1234, 678, 999, 453, 890, 984, 600, 340, 980, 240, 650, 723, 1000, 444, 1102, 781, 101, 903, 567
        };
        int[] arr2 = {
                657, 849, 1039, 29, 1038, 48
        };


        System.out.println("Original array:");
        MergeSort.printArray(arr2);

        // Record the start time
        long startTime = System.nanoTime();

        // Sort the array using merge sort
        MergeSort.mergeSort(arr2, 0, arr2.length - 1);

        // Record the end time
        long endTime = System.nanoTime();

        // Calculate the time taken in nanoseconds
        long duration = endTime - startTime;

        System.out.println("Sorted array:");
        MergeSort.printArray(arr2);

        // Output the time taken
        System.out.println("Time taken to sort (nanoseconds): " + duration);
    }
}
