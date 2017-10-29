import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArjitAndPrintingPress {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String size = br.readLine();
		int T = Integer.parseInt(size);
		
		for(int i=0;i<T;i++){
			String word =br.readLine();
			String reserve = br.readLine();
			lexicographicallySmallest(word,reserve);
		}
	}

	private static void lexicographicallySmallest(String word, String reserve) {
		
		int i=0;
		int j=0;
		String result = new String();
		char [] charArray= reserve.toCharArray();
		Arrays.sort(charArray);
		reserve=String.valueOf(charArray);
		
		while(i<word.length() && j<reserve.length()){
			if(word.charAt(i)>reserve.charAt(j)){
				result += reserve.charAt(j);
				j++;
			}
			else{
				result +=word.charAt(i);		
			}
			i++;
		}
		if(i!=word.length()){
			for(int k=i;k<word.length();k++){
				result+=word.charAt(k);
			}
		}
		System.out.println(result);
	}

}
