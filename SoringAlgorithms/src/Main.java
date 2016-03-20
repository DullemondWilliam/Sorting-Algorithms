import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = {10,2,1,4,6,3,9,3,1,8,4,12,15};
		printArray(array);
		array = heapSort(array);
		printArray(array);
		
	}

	public static void printArray(int[] inputArray){
		if(inputArray == null){return;}
		System.out.print(inputArray.length+"\t: ");
		for(int a : inputArray){
			System.out.print(a+",");
		}
		System.out.println("");
	}
	
	public static int[]	heapSort(int[] inputArray){
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
	
	public static int[] quickSort(int[] inputArray){
		if(inputArray.length <= 1){return inputArray;}
		int aSize = 0;
		int bSize = 0;
		int pivot = (int)(Math.random() * (inputArray.length));

		for(int i=0;i<inputArray.length;i++){
			if(inputArray[i]>=inputArray[pivot]){
				aSize++;
			}else{
				bSize++;
			}
		}
		int[] a = new int[aSize];
		int[] b = new int[bSize];
		int aPos = 0;
		int bPos = 0;
		while(aSize>aPos || bSize>bPos){
			if(inputArray[aPos+bPos]>=inputArray[pivot]){
				a[aPos] = inputArray[aPos+bPos];
				aPos++;
			}else{
				b[bPos] = inputArray[aPos+bPos];
				bPos++;
			}
		}
		a = quickSort(a);
		b = quickSort(b);
		
		for(int i=0;i<inputArray.length;i++){
			if(i<bSize){
				inputArray[i] = b[i];
			}else{
				inputArray[i] = a[i-bSize];
			}
		}
		return inputArray;
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
	
	public static int[] selectionSort(int[] inputArray){
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
	
	public static int[] insertionSort(int[] inputArray){
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
	
	public static int[] bubbleSort(int[] inputArray){
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
