package alogrithms;

public class QuickSort extends SortingAlgorithm {

	@Override
	public int[] sort(int[] inputArray) {
		if (inputArray.length <= 1) {
			return inputArray;
		}
		int aSize = 0;
		int bSize = 0;
		int pivot = (int) (Math.random() * (inputArray.length));

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] >= inputArray[pivot]) {
				aSize++;
			} else {
				bSize++;
			}
		}
		int[] a = new int[aSize];
		int[] b = new int[bSize];
		int aPos = 0;
		int bPos = 0;
		while (aSize > aPos || bSize > bPos) {
			if (inputArray[aPos + bPos] >= inputArray[pivot]) {
				a[aPos] = inputArray[aPos + bPos];
				aPos++;
			} else {
				b[bPos] = inputArray[aPos + bPos];
				bPos++;
			}
		}
		a = sort(a);
		b = sort(b);

		for (int i = 0; i < inputArray.length; i++) {
			if (i < bSize) {
				inputArray[i] = b[i];
			} else {
				inputArray[i] = a[i - bSize];
			}
		}
		return inputArray;
	}

}
