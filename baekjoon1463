import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	int n = scanner.nextInt();
    	
    	int[] sol = new int[n+1];
    	sol[1] = 0;
    	for (int i=1; i<n+1; i++) {
    		if (i*3 <= n) {
    			if (sol[i*3] == 0) {
        			sol[i*3] = sol[i] + 1;
        		} else {
        			sol[i*3] = Math.min(sol[i] + 1, sol[i*3]);
        		}
    		}
    		if (i*2 <= n) {
    			if (sol[i*2] == 0) {
    				sol[i*2] = sol[i] + 1;
    			} else {
    				sol[i*2] = Math.min(sol[i] + 1, sol[i*2]);
    			}
    		}
    		
    		if (i+1 <= n) {
    			if (sol[i+1] == 0) {
    				sol[i+1] = sol[i] + 1;
    			} else {
    				sol[i+1] = Math.min(sol[i] + 1, sol[i+1]);
    			}
    		}
    	}
    	
    	System.out.println(sol[n]);
    	
		scanner.close();
    }
}
