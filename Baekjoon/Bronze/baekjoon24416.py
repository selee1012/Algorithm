import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	int n = scanner.nextInt();
    	
    	int[] c1 = new int[n];
    	
    	for (int i=0; i<n; i++) {
    		if ((i==0) || (i==1)) {
    			c1[i] = 1;
    		} else {
    			c1[i] = c1[i-1] + c1[i-2];
    		}
    	}
    	
    	int c2 = n-2;
    	
    	System.out.println(c1[n-1] + " " + c2);
    	
    	scanner.close();
    }
}
