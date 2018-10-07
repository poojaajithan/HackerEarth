/**
 * min-heap property: the value of each node is greater than or equal to the value of its parent, 
 * with the minimum-value element at the root.
 * 
 * max-heap property: the value of each node is less than or equal to the value of its parent, 
 * with the maximum-value element at the root.
**/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HeapNode{
	int heapArr[];
	int maxSize;
	
	public HeapNode(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.heapArr = new int[maxSize];
	}	
}

public class HeapImpl {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of elements : ");
		Integer N = Integer.parseInt(br.readLine());
		HeapNode heap = new HeapNode(10);
		int count=0;
		int pos=0;
		
		for(int i=0;i<N;i++) {
			Integer numToInsert = Integer.parseInt(br.readLine());
			heap.heapArr[count] = numToInsert;
			pos = count;
			count++;
			//Create Max Heap with sift up/sift down operations
			while(pos>0 && (numToInsert > heap.heapArr[(pos-1)/2])) {
				heap.heapArr[pos] = heap.heapArr[(pos-1)/2];
				pos = (pos-1)/2;
			}
			heap.heapArr[pos] = numToInsert;
			
		}
		for(int i=0;i<heap.heapArr.length;i++) {
			System.out.print("\t"+heap.heapArr[i]);
		}
	}

}
