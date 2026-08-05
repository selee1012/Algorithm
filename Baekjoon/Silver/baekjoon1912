import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	int n = scanner.nextInt();
    	int[] li = new int[n];
    	
    	for (int i=0; i<n; i++)
    		li[i] = scanner.nextInt();
    	
    	int[] sol = new int[n];
    	sol[0] = li[0];
    	for (int j=1; j<n; j++) {
    		sol[j] = Math.max(sol[j-1] +li[j], li[j]);
    	}
    	System.out.println(Arrays.stream(sol).max().getAsInt());
    	
    	scanner.close();
    }
}
