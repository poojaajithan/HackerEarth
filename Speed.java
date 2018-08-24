import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Speed {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of testcases :");
		int numTestCases= Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<numTestCases; i++) {
			System.out.println("Enter no of cars :");
			int numCars= Integer.parseInt(br.readLine());
			
			System.out.println("Enter maximum speed of the cars in the order they entered the long straight segment :");
			String[] maxSpeeds = br.readLine().split(" ");
			
			int count = computeMaxCars(maxSpeeds);
			
			System.out.println(count);
			
		}
	}

	private static int computeMaxCars(String[] maxSpeeds) {	
		int count = 1;
		int max = Integer.parseInt(maxSpeeds[0]);
		
		for(int i=1;i<maxSpeeds.length;i++) {
			if(Integer.parseInt(maxSpeeds[i]) < max) {
				max = Integer.parseInt(maxSpeeds[i]);
				count++;
			}
		}
		return count;
		
	}
}
