import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AddAlternateElements {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 9 integers : ");
		String[] numArray = br.readLine().split(" ");
		int [] intArr = Arrays.asList(numArray).stream().mapToInt(Integer::parseInt).toArray();
		int res1 = 0,res2 = 0;
		
		for(int i=0;i<intArr.length;i++) {
			if(i%2 == 0) {
				res1 += intArr[i];
			}else {
				res2 += intArr[i];
			}
		}
		System.out.println(res1);
		System.out.println(res2);
	}

}
