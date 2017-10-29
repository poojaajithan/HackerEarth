import java.util.ArrayList;
import java.util.Scanner;

public class Legos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int a0 = 0; a0 < t; a0++){
        	ArrayList<Integer> legos = new ArrayList<>();
        	legos.add(in.nextInt()) ;
        	legos.add(in.nextInt()) ;
        	legos.add(in.nextInt()) ;
        	legos.add(in.nextInt()) ;
        	int p = in.nextInt();
            int q = in.nextInt();
            answerList.add(productOfPages(legos,p,q));
        }
        for(int i=0;i<answerList.size();i++)
        	System.out.println(answerList.get(i));
    }
    
    static int productOfPages(ArrayList<Integer> legos, int p, int q) {
        int product = 1;
        if(legos.contains(p))
        	legos.remove(new Integer(p));
        if(legos.contains(q))
        	legos.remove(new Integer(q));
        
        for(int i=0; i<legos.size(); i++){
        	product *= legos.get(i);
        }
        return product;
        
    }
}
