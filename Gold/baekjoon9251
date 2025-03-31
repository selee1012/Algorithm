import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	String a = scanner.next();
    	String b = scanner.next();
    	
    	String[] x = new String[a.length()];
    	String[] y = new String[b.length()];
    	
    	for (int i=0; i<a.length(); i++) {
    		x[i] = String.valueOf(a.charAt(i));
    	}
    	
    	for (int j=0; j<b.length(); j++) {
    		y[j] = String.valueOf(b.charAt(j));
    	}
    	
    	int[][] sol = new int[a.length()+1][b.length()+1];
    	
    	for(int c=0; c<a.length()+1; c++) {
    		for(int d=0; d<b.length()+1; d++) {
    			if ((c==0) || (d==0)) {
    				sol[c][d] = 0;
    			} else if (x[c-1].equals(y[d-1])) {
    				sol[c][d] = sol[c-1][d-1] + 1;
    			} else {
    				sol[c][d] = Math.max(sol[c-1][d], sol[c][d-1]);
    			}
    		}
    	}
    	
    	System.out.println(sol[a.length()][b.length()]);
    	
    	scanner.close();
    }
}
