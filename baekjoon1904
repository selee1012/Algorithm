import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	int n = scanner.nextInt();
    	int[] sol = new int[n];
    	
    	for (int i=0; i<n; i++)
    		if (i==0) {
    			sol[i] = 1;
    		} else if (i==1) {
    			sol[i] = 2;
    		} else {
    			sol[i] = (sol[i-1] + sol[i-2]) % 15746;
    		}
    	
    	System.out.println(sol[n-1]);
    	
    	scanner.close();
    }
}
