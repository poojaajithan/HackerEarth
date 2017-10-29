import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SavePatients {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String size = br.readLine();
		int numOfVaccines = Integer.parseInt(size);
		Scanner sc= new Scanner(System.in);
		int [] strengthOfVaccines = new int [numOfVaccines];
		int [] midichloriansCountOfPatients = new int [numOfVaccines];
		String[] inputArray1 = new String[numOfVaccines];
		String[] inputArray2 = new String[numOfVaccines];
		Boolean save = false;
		
		
		String input1 = br.readLine();
		inputArray1 = input1.split(" ");
		String input2 = br.readLine();
		inputArray2 = input2.split(" ");
		
		
		for(int i=0;i<numOfVaccines;i++){
			strengthOfVaccines[i]=Integer.parseInt(inputArray1[i]);
			midichloriansCountOfPatients[i]=Integer.parseInt(inputArray2[i]);
		}
		
		bubbleSort(strengthOfVaccines);
		bubbleSort(midichloriansCountOfPatients);
		
		for(int i=0;i<numOfVaccines;i++){
			if(strengthOfVaccines[i]>midichloriansCountOfPatients[i]){
				save=true;
				continue;
			}
			else{
				save=false;
				break;
			}
		}
		
		if(save){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}

	private static void bubbleSort(int[] arr) {
		
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}		
	}

}
