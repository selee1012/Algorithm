import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	int n = scanner.nextInt();
    	int a = (n*(n+1))/2;
    	int[] inpu = new int[a];
    	
    	for (int i=0; i < a; i++) {
    		inpu[i] = scanner.nextInt();
    	}
    	
    	int[] sol  = new int[a];
    	
    	for (int k = a-n; k<a; k++) {
    		sol[k] = inpu[k];
    	}
    	
    	while (n >= 0) {
    		int r = 0;
    		for (int j = a - (2*n-1); j < a - n; j++ ){
    			sol[j] = inpu[j] + Math.max(sol[a-n+r], sol[a-n+r+1]);
    			r += 1;
    		}
    		a -= n;
    		n -= 1;
    	}
    	System.out.println(sol[0]);
    	
		scanner.close();
    }
}
