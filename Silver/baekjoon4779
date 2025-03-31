import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	while (scanner.hasNextLine()) {
    		String input = scanner.nextLine();
    		if (input.isEmpty())
    			break;
    		int n = Integer.parseInt(input);
    		String[] d = new String[n+1];
    		for (int i=0 ; i <= n; i++) {
    			if (i == 0)
    					d[i] = "-";
    			else {
    				String s = " ".repeat((int)Math.pow(3, i - 1));
    				d[i] = d[i-1] + s + d[i-1];
    			}
    		}
    		System.out.println(d[n]);
    	
    	}
    	
    	scanner.close();
    }
}
