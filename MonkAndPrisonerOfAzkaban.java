import java.io.BufferedReader;
import org.apache.commons.lang3.ArrayUtils;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MonkAndPrisonerOfAzkaban {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter N : ");
		int N= Integer.parseInt(br.readLine());
		System.out.println("Enter N integers : ");
		String[] numArray = br.readLine().split(" ");
		int [] intArr = Arrays.asList(numArray).stream().mapToInt(Integer::parseInt).toArray();
		int indexPositionX [] = new int[intArr.length];
		int indexPositionY [] = new int[intArr.length];
		Stack<Integer> st = new Stack<Integer>();
		
		//Find next greater element
		for(int i=0;i<intArr.length;i++) {
			if(st.isEmpty()) {
				st.push(intArr[i]);
				indexPositionY[i]=-1;
			}else if(intArr[i] <= st.peek()) {
				st.push(intArr[i]);
				indexPositionY[i]=-1;
			}else {
				while(!st.isEmpty() && intArr[i]>st.peek()) {
					indexPositionY[i-1]=st.size()+1;
					st.pop();
				}
				st.push(intArr[i]);
				indexPositionY[i]=-1;
			}		
		}
		st.clear();
		ArrayUtils.reverse(intArr);
		//Find previous greater element
		for(int i=0;i<intArr.length;i++) {
			if(st.isEmpty()) {
				st.push(intArr[i]);
				indexPositionX[i]=-1;
			}else if(intArr[i] <= st.peek()) {
				st.push(intArr[i]);
				indexPositionX[i]=-1;
			}else {
				while(!st.isEmpty() && intArr[i]>st.peek()) {
					indexPositionX[st.size()-1]=i+1;
					st.pop();
				}
				st.push(intArr[i]);
				indexPositionX[i]=-1;
			}		
		}
		for(int i=0;i<intArr.length;i++) {
			if(indexPositionX[i]!=-1)
				indexPositionX[i] = intArr.length- indexPositionX[i];
		}
		System.out.println(indexPositionX);
		
	}
	
	


}
