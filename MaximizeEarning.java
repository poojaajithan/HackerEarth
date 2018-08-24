import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximizeEarning {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of streets in the city :");
		int numStreets= Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<numStreets; i++) {
			System.out.println("Enter no of buildings in the Street and earning on communicating with a building :");
			String[] buildingEarning = br.readLine().split(" ");
			
			System.out.println("Enter height of  buildings :");
			String[] buildingHeight = br.readLine().split(" ");
			
			int count = computeEarnings(buildingHeight);
			
			System.out.println(count*Integer.parseInt(buildingEarning[1]));
			
		}
	}

	private static int computeEarnings(String[] buildingHeight) {	
		int max = 0;
		int count = 0;
		
		for(int i=0;i<buildingHeight.length;i++) {
			if(Integer.parseInt(buildingHeight[i]) > max) {
				max=Integer.parseInt(buildingHeight[i]);
				count++;
			}
		}
		return count;
		
	}

}
