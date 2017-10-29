import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OldKeypadInAForeignLand {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
        int freqSize=sc.nextInt();
        //Integer frequency[]=new Integer[freqSize];
        List <Integer> freqList = new ArrayList<Integer>();
        
        for(int i=0;i<freqSize;i++){
        	freqList.add(sc.nextInt());
        }
  
        Collections.sort(freqList,Collections.reverseOrder());
        
        int k=sc.nextInt();
        int keySize[]=new int[k];
        
        for(int i=0;i<k;i++){
        	keySize[i]=sc.nextInt();
        }
        

	}

}
