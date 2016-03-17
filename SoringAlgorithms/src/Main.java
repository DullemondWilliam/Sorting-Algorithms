
public class Main {

	public static void main(String[] args) {
		int[] array = {3,5,8,3,2,7,8,4,3,5,2,10,12,3,5,23};
		
		printArray(array);
		selectionSort(array);
		printArray(array);
		
	}

	public static void printArray(int[] inputArray){
		for(int a : inputArray){
			System.out.print(a+",");
		}
		System.out.println("");
	}
	
	public static void selectionSort(int[] inputArray){
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
		
	}
	
	public static void insertionSort(int[] inputArray){
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
	}
	
	public static void bubbleSort(int[] inputArray){
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
			if(changed == false){return;}
		}
	}

}
