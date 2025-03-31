import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	int n = scanner.nextInt();
    	
    	int[] mr = new int[n+1];
    	int[] mg = new int[n+1];
    	int[] mb = new int[n+1];
    	
    	mr[0] = 0;
    	mg[0] = 0;
    	mb[0] = 0;
    	
    	for (int i=1; i<n+1; i++) {
    		int r = scanner.nextInt();
        	int g = scanner.nextInt();
        	int b = scanner.nextInt();
        	
        	mr[i] = Math.min(mg[i-1], mb[i-1]) + r;
        	mg[i] = Math.min(mr[i-1], mb[i-1]) + g;
        	mb[i] = Math.min(mr[i-1], mg[i-1]) + b;
    	}
    	
    	System.out.println(Math.min(Math.min(mr[n], mg[n]), mb[n]));
    	
    	scanner.close();
    }
}
