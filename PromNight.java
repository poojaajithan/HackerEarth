import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class PromNight {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int numOfBoys=0;
		int numofGirls=0;
		
		for(int i=0;i<T;i++){
			
			String input = br.readLine();
			String[] inputArray = (String[]) input.split(" ");
			numOfBoys = Integer.parseInt(inputArray[0]);
			numofGirls = Integer.parseInt(inputArray[1]);
			
			int [] heightofBoys = new int[numOfBoys];
			int [] heightofGirls = new int[numofGirls];
			
			String boysInput = br.readLine();
			String[] boysArray = (String[]) boysInput.split(" ");
			
			String girlsInput = br.readLine();
			String[] girlsArray = (String[]) girlsInput.split(" ");
			
			for(int count1 = 0; count1< numOfBoys; count1++){
				heightofBoys[count1] = Integer.parseInt(boysArray[count1]);
			}
			
			for(int count1 = 0; count1< numofGirls; count1++){
				heightofGirls[count1] = Integer.parseInt(girlsArray[count1]);
			}
			
			Arrays.sort(heightofBoys);
			Arrays.sort(heightofGirls);
			
			possibilityForBoyToGetGirl(heightofBoys,heightofGirls);
		}

	}

	private static void possibilityForBoyToGetGirl(int[] heightofBoys,
			int[] heightofGirls) {
		
		int B=0,G=0;
		Boolean noMatch = false;
		
		while(B < heightofBoys.length && G < heightofGirls.length) {
			  if(heightofGirls[G] < heightofBoys[B]){
				  G++;
				  B++;
			  }
			  else{
				  noMatch = true;
				  break;
			  }
		}
		
		if(noMatch){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
		
	}

}
