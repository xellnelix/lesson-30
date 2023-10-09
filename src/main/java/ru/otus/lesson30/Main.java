package ru.otus.lesson30;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] testArr = new int[]{1, 2, 1, 2};
        System.out.println(Arrays.toString(subArray(testArr)));
        System.out.println(checkOneTwoArray(testArr));
    }

    public static int[] subArray(int[] array) {
        int currentIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                currentIndex = i + 1;
            }
        }
        if (currentIndex == 0) {
            throw new RuntimeException();
        }
        return Arrays.copyOfRange(array, currentIndex, array.length);
    }

    public static boolean checkOneTwoArray(int[] array) {
        int oneCounter = 0;
        int twoCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (!(array[i] == 1 || array[i] == 2)) {
                return false;
            }
            if (array[i] == 1) oneCounter++;
            if (array[i] == 2) twoCounter++;
        }
        return oneCounter > 0 && twoCounter > 0;
    }
}
