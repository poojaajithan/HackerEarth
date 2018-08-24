import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SignalRange {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of testcases :");
		int T= Integer.parseInt(br.readLine());


		for(int i=0; i<T; i++) {
			System.out.println("Enter no of towers :");
			int N = Integer.parseInt(br.readLine());
			System.out.println("Enter height of each tower :");
			String[] towerHeight = br.readLine().split(" ");
			Stack<Integer> st = new Stack<>();
			Integer [] rangeArr = new Integer[N];
			for(int j=0;j<towerHeight.length;j++) {
				while(!st.empty() && (Integer.parseInt(towerHeight[st.peek()])<=Integer.parseInt(towerHeight[j]))) {
					st.pop();
				}
				if(st.empty())
					rangeArr[j]=j+1;
				else 
					rangeArr[j]=j-st.peek();
				st.push(j);
			}
			for(int j=0;j<rangeArr.length;j++) {
				System.out.print(rangeArr[j]+" ");
			}
		}
	}
}
