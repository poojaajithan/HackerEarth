import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PepperAndContiguousEvenSubarray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] inp = br.readLine().split(" ");
            int[] A=new int[N];
            for(int i=0;i<N;i++)
            {
                A[i] = Integer.parseInt(inp[i]);
            }
            int ans = solve(N, A);
            System.out.println(ans);
         }

         wr.close();
         br.close();

	}
	 static int solve(int N, int[] A) {
	       
	        int ans=0;
	        int cnt=0;
	        for(int i=0;i<N;i++) {
	            if(A[i]%2==0) {
	            	cnt++;
	            	ans=Math.max(ans,cnt);
	            }
	            else {
	                cnt=0;
	            }
	        }
	        if(ans == 0 ) {
	        	ans =-1;
	        }
	        return ans;
	    }

}
