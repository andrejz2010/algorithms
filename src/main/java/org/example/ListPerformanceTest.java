package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformanceTest {

    public static void testListPerformance(List<Integer> numbers) {
        Random random = new Random();
        int numberOfOperations = 100000;

        System.out.println("Testing performance for " + numbers.getClass().getSimpleName() + " with " + numberOfOperations + " operations.");

        long startInsertTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            int randomIndex = random.nextInt(numbers.size());
            numbers.add(randomIndex, random.nextInt());
        }
        long endInsertTime = System.nanoTime();
        System.out.println("Time for insertions (nanoseconds): " + (endInsertTime - startInsertTime));

        long startGetTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            int randomIndex = random.nextInt(numbers.size());
            numbers.get(randomIndex);
        }
        long endGetTime = System.nanoTime();
        System.out.println("Time for retrieval (nanoseconds): " + (endGetTime - startGetTime));

        long startRemoveTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            int randomIndex = random.nextInt(numbers.size());
            numbers.remove(randomIndex);
        }
        long endRemoveTime = System.nanoTime();
        System.out.println("Time for deletions (nanoseconds): " + (endRemoveTime - startRemoveTime));
    }

    public static void main(String[] args) {
        int initialSize = 1_000_000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < initialSize; i++) {
            int randomInt = random.nextInt();
            arrayList.add(randomInt);
            linkedList.add(randomInt);
        }

        testListPerformance(arrayList);
        testListPerformance(linkedList);
    }
}
