import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {11,9,8,7,6,23,5,34,4,3,2,12,1,45,0,12};
		
		printArray(array);
		array = mergeSort(array);
		printArray(array);
		
	}

	public static void printArray(int[] inputArray){
		if(inputArray == null){return;}
		for(int a : inputArray){
			System.out.print(a+",");
		}
		System.out.println("");
	}
	
	public static int[] mergeSort(int[] inputArray){
		int[] a;
		int[] b;
		int[] output = new int[inputArray.length];
		if(inputArray.length>1){
			a = mergeSort(Arrays.copyOfRange(inputArray, 0, (inputArray.length/2)));
			b = mergeSort(Arrays.copyOfRange(inputArray, (inputArray.length/2),inputArray.length));
		}else{
			return inputArray;
		}
		//merge
		int i=0;
		int j=0;
		while(i < a.length || j < b.length){
			if(i == a.length){
				output[i+j] = b[j];
				j++;
			}else if(j == b.length){
				output[i+j] = a[i];
				i++;
			}else if(a[i]>b[j]){
				output[i+j] = b[j];
				j++;
			}else{
				output[i+j] = a[i];
				i++;
			}
		}
		return output;
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
