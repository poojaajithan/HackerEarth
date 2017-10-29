import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RiseOfTheWeirdThings {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String size = br.readLine();
		int N = Integer.parseInt(size);
		Scanner sc= new Scanner(System.in);
		List <Integer> zombies =  new ArrayList<>();
		List <Integer> vampires =  new ArrayList<>();
		int zombiesSum=0;
		int vampiresSum=0;
		int creature =0;
	
		String input = br.readLine();
		String[] inputArray = input.split(" ");
		
		for(int i=0;i<N;i++){	
			creature = Integer.parseInt(inputArray[i]);
			if(creature % 2==0){
				zombies.add(creature);
			}
			else{
				vampires.add(creature);
			}	
		}
		Collections.sort(zombies);
		Collections.sort(vampires);
		
		for(int i=0;i<zombies.size();i++){
			System.out.print(zombies.get(i)+ " ");
			zombiesSum+=zombies.get(i);
		}
		System.out.print(zombiesSum+" ");
		
		for(int i=0;i<vampires.size();i++){
			System.out.print(vampires.get(i)+ " ");
			vampiresSum+=vampires.get(i);
		}
		System.out.print(vampiresSum+" ");
	}

}
