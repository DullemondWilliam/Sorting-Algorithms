package alogrithms;

public class SelectionSort extends SortingAlgorithm {

	@Override
	public int[] sort(int[] inputArray) {
		int[] workingArray = inputArray.clone();
		for(int i=0;i<workingArray.length;i++){
			int pos = i;
			for(int j=i;j<workingArray.length;j++){
				if(workingArray[pos]>workingArray[j]){
					pos = j;
				}
			}
			int temp = workingArray[pos];
			workingArray[pos] 	= workingArray[i];
			workingArray[i]		= temp;
			inputArray[i]		= temp;
		}
		return inputArray;
	}

}
