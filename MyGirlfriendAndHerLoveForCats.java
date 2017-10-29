import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MyGirlfriendAndHerLoveForCats {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String size = br.readLine();
		int numOfCats = Integer.parseInt(size);
		
		int [] originalStrength = new int[numOfCats];
		int [] calorieValue = new int[numOfCats];
		int result=0;
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<numOfCats;i++){
			if(sc.hasNextInt())
				originalStrength[i] = sc.nextInt();
		}
		
		for(int i=0;i<numOfCats;i++){
			if(sc.hasNextInt())
			    calorieValue[i] = sc.nextInt();
		}
		
		Arrays.sort(originalStrength);
		Arrays.sort(calorieValue);
		
		for(int i=0;i<numOfCats;i++){
			result+=originalStrength[i]*calorieValue[i];
		}
		
		System.out.println(result);
	}

}
