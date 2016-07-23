package alogrithms;

public class InsertionSort extends SortingAlgorithm {

	@Override
	public int[] sort(int[] inputArray) {
		for(int i=0;i<inputArray.length-1;++i){
			if(inputArray[i]>inputArray[i+1]){
				for(int j=i;j>=0;--j){
					if(inputArray[j]>inputArray[j+1]){
						int temp = inputArray[j];
						inputArray[j] 	= inputArray[j+1];
						inputArray[j+1]	= temp;
					}
				}
			}
		}
		return inputArray;
	}

}
