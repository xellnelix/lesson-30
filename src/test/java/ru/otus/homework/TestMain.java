package ru.otus.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.otus.lesson30.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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

	@MethodSource("addOneTwoArrayData")
	@ParameterizedTest
	public void checkOneTwoArrayTest(int[] arr, boolean ans) {
		Assertions.assertEquals(ans, Main.checkOneTwoArray(arr));
	}

	public static Stream<Arguments> addOneTwoArrayData() {
		List<Arguments> out = new ArrayList<>();
		out.add(Arguments.arguments(new int[] {1,2,2,1}, true));
		out.add(Arguments.arguments(new int[] {1,2}, true));
		out.add(Arguments.arguments(new int[] {1,1}, false));
		out.add(Arguments.arguments(new int[] {1,3}, false));
		return out.stream();
	}
}
