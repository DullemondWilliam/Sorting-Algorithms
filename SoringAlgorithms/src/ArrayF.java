
public class ArrayF {
	public static void printArray(int[] inputArray){
		if(inputArray == null){return;}
		System.out.print(inputArray.length+"\t: ");
		for(int a : inputArray){
			System.out.print(a+",");
		}
		System.out.println("");
	}
}
