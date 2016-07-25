package alogrithms;

public class QuickSort extends SortingAlgorithm {

	@Override
	public int[] sort(int[] inputArray) {
		// Base Case
		
		if (inputArray.length <= 1) {
			System.out.println("BedRock");
			return inputArray;
		}

		int pivot = (int) (inputArray.length * Math.random());
		
		System.out.print("Pivot ["+inputArray[pivot]+"]");
		ArrayF.printArray(inputArray);
		
		int left = 0;
		int right = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] <= inputArray[pivot])
				left++;
			else
				right++;
		}
		int[] leftArr = new int[left];
		int[] rightArr = new int[right];

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] <= inputArray[pivot])
				leftArr[--left] = inputArray[i];
			else
				rightArr[--right] = inputArray[i];
		}
		// Send Down
		if(leftArr.length > 1){
			leftArr  = sort(leftArr);
		}
		if(rightArr.length > 1){
			rightArr = sort(rightArr);
		}
		
		
		for (int i = 0; i < inputArray.length; i++) {
			if (i < leftArr.length)
				inputArray[i] = leftArr[i];
			else
				inputArray[i] = rightArr[i - leftArr.length];
		}
		return inputArray;

	}

}
