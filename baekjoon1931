import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int N = scanner.nextInt();
    	int[][] t = new int[N][2];
    	
    	for (int i=0; i<N; i++) {
    		t[i][0] = scanner.nextInt();
    		t[i][1] = scanner.nextInt();
    	}
    	
    	Arrays.sort(t, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
    	
    	int count = 0;
    	int lastend = Integer.MIN_VALUE;
    	
    	for (int i=0; i<N; i++) {
    		if (t[i][0] >= lastend) {
    			count ++;
    			lastend = t[i][1];
    		}
    	}
    	
    	System.out.println(count);
    	
    	scanner.close();
    }
}
