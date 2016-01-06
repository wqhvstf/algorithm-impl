package com.algorithm.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * @author qinghua.wu
 * @date 2016年1月6日-上午9:24:03 排序方法类
 */
public class Sort {
	/**
	 * 插入排序
	 */
	public static <T> void insertionSort(T[] t, Comparator<? super T> comparator) {
		for (int j = 1; j < t.length; j++) {
			T key = t[j];
			int i = j - 1;
			while (i >= 0 && comparator.compare(t[i], key) > 0) {
				t[i + 1] = t[i];
				i--;
			}
			t[i + 1] = key;
		}
	}
	/**
	 * 分治法排序
	 * 
	 * @param t
	 * @param comparator
	 */
	public static <T> void mergeSort(T[] t, Comparator<? super T> comparator) {
		mergeSort(t, 0, t.length, comparator);
	}

	private static <T> void mergeSort(T[] t, int p, int r, Comparator<? super T> comparator) {
		if (p + 1 < r) {
			int q = (p + r) / 2;
			mergeSort(t, p, q, comparator);
			mergeSort(t, p + 1, r, comparator);
			merge(t, p, q, r, comparator);
		}
	}

	private static <T> void merge(T[] t, int p, int q, int r, Comparator<? super T> comparator) {
		T[] left = Arrays.copyOfRange(t, p, q);
		T[] right = Arrays.copyOfRange(t, q, r);
		int indexLeft = 0;
		int indexRight = 0;

		for (int i = p; i < r; i++) {
			if (indexLeft >= left.length) {
				break;
			}

			if (indexRight >= right.length) {
				System.arraycopy(left, indexLeft, t, i, left.length - indexLeft);
				break;
			}

			if (comparator.compare(left[indexLeft], right[indexRight]) < 0) {
				t[i] = left[indexLeft++];
			} else {
				t[i] = right[indexRight++];
			}
		}
	}
}
