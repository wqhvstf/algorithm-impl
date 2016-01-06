package com.algorithm.sort;

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
}
