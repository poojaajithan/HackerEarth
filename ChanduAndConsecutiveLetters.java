import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanduAndConsecutiveLetters {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String size = br.readLine();
		int T = Integer.parseInt(size);
		
		for(int i=0;i<T;i++){
			String str=br.readLine();
			deleteConsecutiveLetters(str);
		}

	}

	private static void deleteConsecutiveLetters(String str) {
		
		String result = new String();
		char [] charArray= str.toCharArray();
		result+=charArray[0];
		for(int i=1;i<charArray.length;i++){
			if(charArray[i]!=charArray[i-1]){
				result+=charArray[i];
			}		
		}
		System.out.println(result);
		
	}

}
