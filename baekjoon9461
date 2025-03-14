import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	int n = scanner.nextInt();
    	
    	for (int i=0; i<n; i++) {
    		int a = scanner.nextInt();
    		long[] sol = new long[a];
    		
    		for (int j=0; j<a; j++) {
    			if ((j==0) || (j==1) || (j==2)) {
    				sol[j] = 1;
    			} else if ((j==3) || (j==4)){
    				sol[j] = 2;
    			} else {
    				sol[j] = sol[j-1] + sol[j-5];
    			}
    		}
    		System.out.println(sol[a-1]);
    	}
    	
    	scanner.close();
    }
}
