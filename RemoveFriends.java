import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class RemoveFriends {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of testcases :");
		int T= Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			System.out.println("Enter N and K :");
			String input[]=br.readLine().split(" ");
			int K= Integer.parseInt(input[1]);
			String popularityArr[]=br.readLine().split(" ");
			LinkedList<String> list = new LinkedList(Arrays.asList(popularityArr));
			LinkedList<String> removeList = new LinkedList<>();
			int count=0;
			while((count<K)) {
				for(int j=0;j<list.size()-1;j++) {
					if((count<=K) && (Integer.parseInt(list.get(j)) < Integer.parseInt(list.get(j+1)))) {
						removeList.add(list.get(j));
						count++;
					}
				}
				list.removeAll(removeList);
				removeList.clear();
			}
			for(int j=0;j<list.size();j++) {
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
	}
}
