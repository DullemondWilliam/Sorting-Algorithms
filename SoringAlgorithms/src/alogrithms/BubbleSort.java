package alogrithms;

public class BubbleSort extends SortingAlgorithm {

	@Override
	public int[] sort(int[] inputArray) {
		for(int i=inputArray.length-1;i>0;--i){
			Boolean changed = false;
			for(int j=0;j<i;++j){
				if(inputArray[j]>(inputArray[j+1])){
					changed = true;
					int temp = inputArray[j];
					inputArray[j] 	= inputArray[j+1];
					inputArray[j+1]	= temp;
				}

			}
			if(changed == false){return inputArray;}
		}
		return inputArray;
	}

}
