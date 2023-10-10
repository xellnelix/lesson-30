package ru.otus.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.otus.lesson30.Main;

public class TestMain {
	@Test
	public void subArrayException() {
		int[] array = new int[]{5, 5};
		Assertions.assertThrows(RuntimeException.class, () -> Main.subArray(array));
	}

	@Test
	public void subArrayCorrect() {
		int[] array = new int[]{1, 2, 1, 2, 2};
		Assertions.assertArrayEquals(new int[]{2, 2}, Main.subArray(array));
	}

	@Test
	public void checkOneTwoArrayCorrectFirst() {
		int[] array = new int[]{1, 2};
		Assertions.assertTrue(Main.checkOneTwoArray(array));

	}

	@Test
	public void checkOneTwoArrayCorrectSecond() {
		int[] array = new int[]{1, 2, 2, 1};
		Assertions.assertTrue(Main.checkOneTwoArray(array));
	}

	@Test
	public void checkOneTwoArrayIncorrectFirst() {
		int[] array = new int[]{1, 1};
		Assertions.assertFalse(Main.checkOneTwoArray(array));
	}

	@Test
	public void checkOneTwoArrayIncorrectSecond() {
		int[] array = new int[]{1, 3};
		Assertions.assertFalse(Main.checkOneTwoArray(array));
	}
}
