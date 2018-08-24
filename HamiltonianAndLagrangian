import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HamiltonianAndLagrangian {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of students : ");
		int numStudents= Integer.parseInt(br.readLine());

		System.out.println("Enter marks of students :");
		String[] numMarks = br.readLine().split(" ");

		int intMarks[] = Arrays.asList(numMarks).stream().mapToInt(Integer::parseInt).toArray();
		int j=0;
		for(int i=0;i<intMarks.length-1;i++) {
			for(j=i+1;j<intMarks.length;j++) {
				if(intMarks[i]<intMarks[j]) {
					break;
				}
			}
			if(j==intMarks.length) {
				System.out.print(intMarks[i]+"\t");
			}
		}
		System.out.print(intMarks[intMarks.length-1]);
	}
}
