package com.vetal;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;


class SortTest {

	@Test
	void insertionSort() {
		int[] arrayToSort = {5, 1, 3, 7, 4};
		int[] sortedArray = {1, 3, 4, 5, 7};

		InsertionSort.insertionSort(arrayToSort);

		assertThat(arrayToSort).containsExactly(sortedArray);
	}

	@Test
	void mergeSort() {
		int[] arrayToSort = {5, 1, 3, 7, 4};
		int[] sortedArray = {1, 3, 4, 5, 7};

		MergeSort.mergeSort(arrayToSort);

		assertThat(arrayToSort).containsExactly(sortedArray);
	}
}