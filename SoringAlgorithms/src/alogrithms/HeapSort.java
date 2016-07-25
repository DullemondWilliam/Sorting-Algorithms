package alogrithms;

public class HeapSort extends SortingAlgorithm {

	public int parentLoc(int i){
		return (int) Math.floor((i-1)/2);
	}
	
	@Override
	public int[] sort(int[] inputArray) {
		for(int i=inputArray.length-1; i >= 0; i--){
			int par = i;
			int prev = i;
			while(true){
				prev = par;
				par  = parentLoc(prev);
				
				if(prev == 0 || inputArray[i] > inputArray[par]){
					int temp = inputArray[i];
					inputArray[i] = inputArray[prev];
					inputArray[prev] = temp;
					break;
				}
			
			}
		}
		///////////////////////////////////////////////////////////////////////
		int arrSize = inputArray.length;
		int[] outputArray = new int[arrSize];
		
		while(arrSize > 0){
			outputArray[inputArray.length-arrSize] = inputArray[0];
			arrSize--;
			inputArray[0] = inputArray[arrSize];
			inputArray[arrSize] = -1;
			//Trickle down
			inputArray = trickleDown(inputArray,arrSize);
		}
		
		
		return outputArray;
	}
	
	public int[] trickleDown(int[] input, int size){
		int curr = 0;
		
		while(true){
			//Do i have Children
			if((curr*2)+2 < size){
				//We have 2 Children
				if(input[(curr*2)+1] < input[(curr*2)+2]){
					if(input[(curr*2)+1] < input[curr]){
						int temp = input[(curr*2)+1];
						input[(curr*2)+1] = input[curr];
						input[curr] = temp;
						curr = (curr*2)+1;
						continue;
					}else{
						break;
					}
				}else{
					if(input[(curr*2)+2] < input[curr]){
						int temp = input[(curr*2)+2];
						input[(curr*2)+2] = input[curr];
						input[curr] = temp;
						curr = (curr*2)+2;
						continue;
					}else{
						break;
					}
				}
			}else if((curr*2)+1 < size){
				if(input[curr] > input[(curr*2)+1]){
					int temp = input[(curr*2)+1];
					input[(curr*2)+1] = input[curr];
					input[curr] = temp;
					break;
				}else{
					break;
				}
			}else{
				break;
			}
		}
		return input;
	}
		
}
