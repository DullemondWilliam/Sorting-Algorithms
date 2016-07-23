import alogrithms.*;

public class Main {

	public static void main(String[] args) {
		int[] array = {10,2,1,4,6,3,9,3,1,8,4,12,15};
		ArrayF.printArray(array);
		
		SortingAlgorithm s = new MergeSort();
		array = s.sort(array);
		
		ArrayF.printArray(array);
		
	}
}
