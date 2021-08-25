package com.vetal;

public class MergeSort {

	public static void mergeSort(int[] arr) {
		int len = arr.length;
		if (len < 2) {
			return;
		}
		// merge sort requires more space comparing to insertion sort
		// here we allocate additional space
		int[] leftHalf = new int[len / 2];
		int[] rightHalf = new int[len - len / 2];
		System.arraycopy(arr, 0, leftHalf, 0, leftHalf.length);
		System.arraycopy(arr, leftHalf.length, rightHalf, 0, rightHalf.length);

		// we have log(n) of such recursive calls 
		mergeSort(leftHalf);
		mergeSort(rightHalf);

		// this call has O(n) complexity, so the total complexity with that calls above is n*log(n)
		mergeSortedArrays(arr, leftHalf, rightHalf);
	}

	private static void mergeSortedArrays(int[] arr, int[] leftHalf, int[] rightHalf) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < leftHalf.length && j < rightHalf.length) {
			if (leftHalf[i] <= rightHalf[j]) {
				arr[k++] = leftHalf[i++];
			} else {
				arr[k++] = rightHalf[j++];
			}
		}
		while (i < leftHalf.length) {
			arr[k++] = leftHalf[i++];
		}
		while (j < rightHalf.length) {
			arr[k++] = rightHalf[j++];
		}
	}
}
