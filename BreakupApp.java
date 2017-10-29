import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakupApp {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();
        int N = Integer.parseInt(size);
        int weightage19 =0 ;
        int weightage21=0;
        
        for(int i=0;i<N;i++){
        	String S= br.readLine();
        	if(S.contains("19")){
        		if(S.startsWith("G:")){
        			weightage19 = weightage19 + 2;
        		}
        		if(S.startsWith("M:")){
        			weightage19 = weightage19 + 1;
        		}
        	}
        	
        	if(S.contains("21")){
        		if(S.startsWith("G:")){
        			weightage21 = weightage21 + 2;
        		}
        		if(S.startsWith("M:")){
        			weightage21 = weightage21 + 1;
        		}
        	}
        }
        
        if(weightage19 > weightage21){
        	System.out.println("Date");
        }
        else{
        	System.out.println(" No Date");
        }
        		
        
	}

}

