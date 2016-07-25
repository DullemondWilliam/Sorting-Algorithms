package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import alogrithms.*;

public class AlgorithmTesting {
	int[] array = {10,2,4,2,1,4,6,5,2,12,9,7,5,8};
	SortingAlgorithm sorting;
	
	public Boolean inOrder(int[] array){
		for(int i=1; i < array.length; i++){
			if(array[i]<array[i-1]){
				return false;
			}
		}
		return true;
	}
	
	
	@Test
	public void testBubbleSort() {
		sorting = new BubbleSort();
		assertTrue(inOrder(sorting.sort(array)));
	}
	
	@Test
	public void testHeapSort() {
		sorting = new HeapSort();
		assertTrue(inOrder(sorting.sort(array)));
	}
	
	@Test
	public void testBubbleInsertionSort() {
		sorting = new InsertionSort();
		assertTrue(inOrder(sorting.sort(array)));
	}
	
	@Test
	public void testMergeSort() {
		sorting = new MergeSort();
		assertTrue(inOrder(sorting.sort(array)));
	}
	
	@Test
	public void testQuickSort() {
		sorting = new QuickSort();
		assertTrue(inOrder(sorting.sort(array)));
	}
	
	@Test
	public void testSelectionSort() {
		sorting = new SelectionSort();
		assertTrue(inOrder(sorting.sort(array)));
	}
}
