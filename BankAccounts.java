import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BankAccounts {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Testcases ? :");
		String size = br.readLine();
        int testCases = Integer.parseInt(size);
        
        int [] input = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < testCases; i++){   	
        	System.out.println("n k s d ? :");
        	for(int j=0; j < 4; j++){
        		input[j] = sc.nextInt();
        	}
        	double [] profitArray = new double[input[0]];
        	double sum = 0;
        	System.out.println("Profits ? :");
        	for(int k=0; k < input[0]; k++){
        		profitArray[k] = sc.nextInt();
        		sum += calculateMax (input[1], (0.01* input[2])*profitArray[k]);
        	}
        	printMax(sum,input[3]);
    	}
	}
 
	private static void printMax(double num1, double num2) {
		System.out.println("fee : "+num1+" upfront : "+num2);
		if((num1<num2) || (num1==num2)){
			System.out.println("Fee");
		}else{
			System.out.println("Upfront");
		}
	}

	private static double calculateMax(double num1,double num2){
		
		double max = (num1 > num2) ? num1 :  num2;
		return max;
		
	}
	
	
}
