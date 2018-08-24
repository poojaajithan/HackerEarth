import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ArrayFormation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter N : ");
		int N= Integer.parseInt(br.readLine());
		System.out.println("Enter N numbers :");
		String[] num = br.readLine().split(" ");
		int numArr[] = new int[N];
		for(int i=0;i<num.length;i++) {
			numArr[i]=Integer.parseInt(num[i]);
		}	
		Stack<Integer> st = new Stack<>();
		LinkedList<Integer> queue = new LinkedList<>();
		for(int i=0;i<N;i++) {
			Boolean composite=false;
			for(int j=2;j<numArr[i];j++) {
				if(numArr[i]%j==0) {
					queue.add(numArr[i]);
					composite=true;
					break;
				}
			}
			if(!composite) {
				st.push(numArr[i]);
			}
		}
		for(int i=0;i<st.size();i++) {
			System.out.print(st.get(i)+" ");
		}	
		System.out.println();
		for(int i=queue.size()-1;i>=0;i--) {
			System.out.print(queue.get(i)+" ");
		}
	}

}
