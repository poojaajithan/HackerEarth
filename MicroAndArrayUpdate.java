import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MicroAndArrayUpdate {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of testcases : ");
		int numTestCases= Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<numTestCases; i++) {
			System.out.println("Enter N and K : ");
			String[] numArr = br.readLine().split(" ");
			
			System.out.println("Enter N integers :");
			String[] numArray = br.readLine().split(" ");
			
			int intArr[] = Arrays.asList(numArray).stream().mapToInt(Integer::parseInt).sorted().toArray();
			
			int count = 0;
			if(intArr[0] < Integer.parseInt(numArr[1])) {
				count = Integer.parseInt(numArr[1]) - intArr[0];
			}
			
			System.out.println(count);
		}
		
	}
}
