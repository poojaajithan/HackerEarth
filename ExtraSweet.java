import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExtraSweet {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Long> totalSweetness = new ArrayList<>();

		System.out.println("Enter length of the chocolate bar and number of students :");
		String input = br.readLine();
		String[] inputArray = input.split(" ");
		
		ArrayList<Character> chocolate = new ArrayList<>(Collections.nCopies(Integer.parseInt(inputArray[0]),'0'));
		
		for(int i=0; i<Integer.parseInt(inputArray[1]); i++){
			long sweetness =0;
			System.out.println("Enter left and right indices :");
			String indices = br.readLine();
			String[] indexArray = indices.split(" ");
			
			int leftIndex = Integer.parseInt(indexArray[0]);
			int rightIndex = Integer.parseInt(indexArray[1]);
				
			if(chocolate.get(leftIndex) != 'c' && chocolate.get(rightIndex) != 'c'){
				sweetness += consumeChocolate(chocolate,leftIndex,rightIndex,Integer.parseInt(inputArray[0]));
			}		
			totalSweetness.add(sweetness);
		}
		System.out.println("Total Sweetness : ");
		for(int i=0;i<totalSweetness.size();i++)
            System.out.println(totalSweetness.get(i));
	}

	private static long consumeChocolate(ArrayList<Character> chocolate, int leftIndex, int rightIndex, int lengthOfChocolate) {
		long sweetness = 0;
		for(int i=leftIndex ; i<=rightIndex; i++){
			chocolate.set(i,'c');
			sweetness += i;
		}
		if(leftIndex !=0){
			for(int i=leftIndex-1; i>=0 ; i--){
				if(chocolate.get(i) != 'c'){
					chocolate.set(i,'c');
					sweetness += i;
					break;
				}
			}	
		}
		if(rightIndex != lengthOfChocolate-1){
			for(int i=rightIndex+1; i<lengthOfChocolate ; i++){
				if(chocolate.get(i) != 'c'){
					chocolate.set(i,'c');
					sweetness += i;
					break;
				}
			}	
		}
		return sweetness;
	}

}
