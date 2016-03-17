
public class Main {

	public static void main(String[] args) {
		int[] array = {3,5,8,3,2,7,8,4,3,5,2};
		
		printArray(array);
		insertionSort(array);
		printArray(array);
		
	}

	public static void printArray(int[] inputArray){
		for(int a : inputArray){
			System.out.print(a+",");
		}
		System.out.println("");
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
