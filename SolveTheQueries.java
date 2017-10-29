import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolveTheQueries {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n+1];
	        for(int i = 1; i <= n; i++){
	            arr[i] = in.nextInt();
	        }
	        int numQueries = in.nextInt();
	        ArrayList<Long> answers = new ArrayList<>();
	        for(int i = 0; i < numQueries; i++){
	        	String query = br.readLine();
				String[] queryArray = query.split(" ");
				
				switch(queryArray.length){
					case 4 :
						set(arr, Integer.parseInt(queryArray[1]), Integer.parseInt(queryArray[2]), Integer.parseInt(queryArray[3]));
						break;
					case 6:
						long ans = ask(arr, Integer.parseInt(queryArray[1]), Integer.parseInt(queryArray[2]), Integer.parseInt(queryArray[3]), Integer.parseInt(queryArray[4]), Integer.parseInt(queryArray[5]));
						answers.add(ans);
						break;
				}	            
	        }
	        for(int i=0;i<answers.size();i++)
	            System.out.println(answers.get(i));
	}

	private static long ask(int[] arr, int i, int j, int k, int l, int m) {
		double numerator = product(arr,i,j);
		double denominator = product(arr,k,l);
		long numeratorL= product(arr,i,j);
		long denominatorL= product(arr,k,l);;
		
		if((numerator/denominator) == Math.ceil((numerator/denominator))){
			return (numeratorL/denominatorL) % m;
		}else{
			return -1;
		}
		
	}

	private static long product(int[] arr, int i, int j) {
		long product = 1;
		for(int count=i; count<=j; count++){
			product *= arr[count];
		}
		return product;
	}

	private static void set(int[] arr, int i, int j, int x) {		
		for(int count=i; count<=j; count++){
			arr[count] = x;
		}		
	}

}
