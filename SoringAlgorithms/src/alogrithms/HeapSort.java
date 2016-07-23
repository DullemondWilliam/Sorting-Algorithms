package alogrithms;
public class HeapSort extends SortingAlgorithm {

	@Override
	public int[] sort(int[] inputArray) {
		int i = inputArray.length-1;
		for(;i>=0;i--){
			if(inputArray[i]<inputArray[(i-1)/2]){
				System.out.println("Switch "+i+" : "+(i-1)/2);
				int temp = inputArray[(i-1)/2];
				inputArray[(i-1)/2] = inputArray[i];
				inputArray[i]		= temp;
			}
		}
		return inputArray;
	}

}
