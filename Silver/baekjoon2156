import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	int n = scanner.nextInt();
    	
    	int[] inp = new int[n];
    	
    	for (int i=0; i<n; i++) {
    		inp[i] = scanner.nextInt();
    	}
    	
    	int[] sol = new int[n];
    	
    	sol[0] = inp[0];
    	if (n > 1) {
    		sol[1] = inp[0] + inp[1];
    	}
    	if (n > 2) {
    		sol[2] = Math.max(sol[1], Math.max(sol[0] + inp[2], inp[1] + inp[2]));
    	}
    	if (n > 3) {
    		for (int j=3; j<n; j++) {
    			sol[j] = Math.max(Math.max(sol[j-1], sol[j-2] + inp[j]), sol[j-3] + inp[j-1] + inp[j]);
    		}
    	}
    	
    	if (n==1) {
    		System.out.println(sol[0]);
    	} else {
    		System.out.println(sol[n-1]);
    	}
    	
		scanner.close();
    }
}
