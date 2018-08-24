import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LittleMonkAndGobletOfFire {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Q : ");
		int Q = Integer.parseInt(br.readLine());
		LinkedList<Integer> queueList[] = new LinkedList[5];
		for(int i=0;i<5;i++) {
			queueList[i] = new LinkedList<Integer>();
		}
		for(int i=0;i<Q;i++) {
			String operations[] = br.readLine().split(" ");
			if(operations.length==3) {
				if(!queueList[0].contains(Integer.parseInt(operations[1]))) {
					queueList[0].add(Integer.parseInt(operations[1]));
				}
				queueList[Integer.parseInt(operations[1])].add(Integer.parseInt(operations[2]));
			}else {
				int frontElement=queueList[0].peek();
				if(queueList[frontElement].isEmpty()) {
					queueList[0].remove();
				}else {
					System.out.println(frontElement + " " + queueList[frontElement].remove());
				}	
			}
		}
	}

}
