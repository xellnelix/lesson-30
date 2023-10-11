package ru.otus.lesson30;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }

    public static int[] subArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 1) {
                return Arrays.copyOfRange(array, i + 1, array.length);
            }
        }
        throw new RuntimeException();
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
