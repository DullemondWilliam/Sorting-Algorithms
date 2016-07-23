package alogrithms;

import java.util.Arrays;

public class MergeSort extends SortingAlgorithm {
	@Override
	public int[] sort(int[] inputArray) {
		int[] a;
		int[] b;
		int[] output = new int[inputArray.length];
		if (inputArray.length > 1) {
			a = sort(Arrays.copyOfRange(inputArray, 0, (inputArray.length / 2)));
			b = sort(Arrays.copyOfRange(inputArray, (inputArray.length / 2), inputArray.length));
		} else {
			return inputArray;
		}
		// merge
		int i = 0;
		int j = 0;
		while (i < a.length || j < b.length) {
			if (i == a.length) {
				output[i + j] = b[j];
				j++;
			} else if (j == b.length) {
				output[i + j] = a[i];
				i++;
			} else if (a[i] > b[j]) {
				output[i + j] = b[j];
				j++;
			} else {
				output[i + j] = a[i];
				i++;
			}
		}
		return output;
	}
}
