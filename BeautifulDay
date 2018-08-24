import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BeautifulDay {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of checkpoints : ");
		int numTestCases= Integer.parseInt(br.readLine());

		System.out.println("Enter N integers :");
		String[] numArray = br.readLine().split(" ");

		int intArr[] = Arrays.asList(numArray).stream().mapToInt(Integer::parseInt).toArray();

		int mid = 0;
		if(intArr.length % 2 == 0) {
			mid = intArr.length / 2;
		}else {
			mid = (intArr.length / 2) + 1;
		}
		int s1=0;
		int s2=0;
		for(int j=0;j<intArr.length;j++) {
			if(j<mid) {
				s1+=intArr[j];
			}else {
				s2+=intArr[j];
			}
		}
		System.out.println(s1*s2);



	}
}
