import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	int[] point = new int[n + 1];
    	point[0] = 0;
    	
    	for (int i=1; i<n+1; i++) {
    		 point[i] = scanner.nextInt();
    	}
    	
    	int max_Point[] = new int[n+1];
    	int max_con_Point[] = new int[n+1];
    	
    	max_Point[0] = 0;
    	max_con_Point[0] = 0;
    	max_Point[1] = point[1];
    	max_con_Point[1] = point[1];
    	
    	for (int i=2; i<n+1; i++) {
    		if (max_Point[i-2] < max_con_Point[i-2])
    				max_Point[i] = max_con_Point[i-2] + point[i];
    		else
    			max_Point[i] = max_Point[i-2] + point[i];
    		max_con_Point[i] = max_Point[i-1] + point[i];
    	}
    	
    	if (max_con_Point[n] > max_Point[n])
    		System.out.println(max_con_Point[n]);
    	else
    		System.out.println(max_Point[n]);
    	
    	scanner.close();
    }
    
}
