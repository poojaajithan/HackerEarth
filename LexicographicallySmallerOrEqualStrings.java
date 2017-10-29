import java.util.Scanner;

public class LexicographicallySmallerOrEqualStrings {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] z = new String[n];
        
        for(int z_i = 0; z_i < n; z_i++){
            z[z_i] = in.next();
        }
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
        	int count = 0 ;
            int l = in.nextInt();
            int r = in.nextInt();
            String s = in.next();  
            count += countLexicographicallySmallerOrEqualStrings(z,l-1,r-1,s);
            System.out.println(count);
        }     
	}

	private static int countLexicographicallySmallerOrEqualStrings(String[] z, int l, int r, String s) {
		int count=0;
		for(int i=l ; i<=r ; i++){
			if(z[i].compareToIgnoreCase(s)<=0){
				count++;
			}
		}
		return count;
	}

}
