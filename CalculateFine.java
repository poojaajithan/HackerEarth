import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculateFine {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of Testcases :");
		String size = br.readLine();
		int testCases = Integer.parseInt(size);
		ArrayList<Long> totalFine = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < testCases; i++){   	
			
			System.out.println("Enter N and date :");
			String input = br.readLine();
			String[] inputArray = input.split(" ");

			System.out.println("Enter "+ inputArray[0] +" car numbers :");
			String carNumbers = br.readLine();
			String[] carNumbersArray = carNumbers.split(" ");

			System.out.println("Enter "+ inputArray[0] +" penalities :");
			String penalties = br.readLine();
			String[] penaltiesArray = penalties.split(" ");

			
			if(Integer.parseInt(inputArray[1]) %2 == 0)
				totalFine.add(calculateTotalFine(Integer.parseInt(inputArray[0]), carNumbersArray, penaltiesArray, Integer.parseInt(inputArray[1]) %2 == 0));
			else
				totalFine.add(calculateTotalFine(Integer.parseInt(inputArray[0]), carNumbersArray, penaltiesArray, Integer.parseInt(inputArray[1]) %2 == 0));
			
		}
		System.out.println("Total fine : "+totalFine.toString().replace("[", "\n ").replace("]", " ").replace(",", "\n"));
	}

	private static long calculateTotalFine(Integer N, String [] carNumbersArray, String [] penaltiesArray, Boolean even) {

		long totalFine = 0;
		for(int j=0 ; j<N ; j++){
			if(even && Integer.parseInt(carNumbersArray[j]) % 2 !=0){
				totalFine += Integer.parseInt(penaltiesArray[j]);
			}
			else if(!even && Integer.parseInt(carNumbersArray[j]) % 2 ==0){
				totalFine += Integer.parseInt(penaltiesArray[j]);
			}
		}

		return totalFine;

	}


}
