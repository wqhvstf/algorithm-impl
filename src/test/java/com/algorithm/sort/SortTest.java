package com.algorithm.sort;

import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {

	@Test
	public void TestInsertionSort() {
		Integer[] ints = new Integer[] { 31, 41, 59, 26, 41, 58 };
		Sort.insertionSort(ints, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.intValue() - o2.intValue();
			}
		});

		Assert.assertTrue(ints[0] == 26);
		Assert.assertTrue(ints[1] == 31);
		Assert.assertTrue(ints[2] == 41);
		Assert.assertTrue(ints[3] == 41);
		Assert.assertTrue(ints[4] == 58);
		Assert.assertTrue(ints[5] == 59);
	}

}
