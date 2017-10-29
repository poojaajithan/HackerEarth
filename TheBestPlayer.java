import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TheBestPlayer {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputArray = input.split(" ");
		int numberOfFans  = Integer.parseInt(inputArray[0]);
		int maximumNumberOfFans  = Integer.parseInt(inputArray[1]);
		
		List <FanDetails> fanList = new ArrayList<FanDetails>();
		
		for(int i=0;i<numberOfFans;i++){
			String fanString = br.readLine();
			String[] fanArray = fanString.split(" ");
			String fan = fanArray[0];
			Integer fanQuotient = Integer.parseInt(fanArray[1]);
			fanList.add(new FanDetails(fan,fanQuotient));	
		}
		
		Collections.sort(fanList);
		
		for(int i=0;i<maximumNumberOfFans;i++){
			System.out.println(fanList.get(i).fan);
		}
	}
}

class FanDetails implements Comparable<FanDetails>{
	
	String fan;
	Integer fanQuotient;
	
	FanDetails(String fan, Integer fanQuotient){
		this.fan=fan;
		this.fanQuotient=fanQuotient;
	}

	@Override
	public int compareTo(FanDetails o) {
		if(this.fanQuotient > o.fanQuotient){
			return -1;
		}
		else if(this.fanQuotient == o.fanQuotient){
			return this.fan.compareTo(o.fan);
		}
		else{
			return 1;
		}		
	}
}
