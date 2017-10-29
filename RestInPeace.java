import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RestInPeace {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();
        int T = Integer.parseInt(size);
        
        int [] numArray = new int[T];
        
        for(int i = 0 ; i < T ; i++){
        	String num = br.readLine();
        	numArray[i] = Integer.parseInt(num);     	
        }
        
        for(int i = 0 ; i < T ; i++){
        	if(numArray[i] % 21 == 0)
        	{
        		System.out.println("The streak is broken!");
        	}
        	else if(String.valueOf(numArray[i]).contains("21")){
        			System.out.println("The streak is broken!");
        	}
        	else
        		System.out.println("The streak lives still in our heart!");
        		
        }

	}

}
