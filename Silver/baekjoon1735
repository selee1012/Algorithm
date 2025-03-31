import java.util.*;

public class Main{
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	int a = scanner.nextInt();
    	int b = scanner.nextInt();
    	int c = scanner.nextInt();
    	int d = scanner.nextInt();
    	
    	int s1 = a*d + b*c;
    	int s2 = b*d;
    	

    	for (int i = s1; i>1; i--) {
    		if ((s1 % i == 0) & (s2 % i == 0)) {
    			s1 /= i;
    			s2 /= i;
    			break;
    		}
    		
    	}
    	System.out.println(s1 + " " + s2);
    	
    	scanner.close();
    }
}
