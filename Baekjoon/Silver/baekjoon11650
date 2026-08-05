import java.util.*;

public class Main{

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int N = scanner.nextInt();
    	int[][] sol = new int[N][2]; 
    	
    	for (int i=0; i<N; i++) {
    		int x = scanner.nextInt();
    		int y = scanner.nextInt();
    		sol[i][0] = x;
    		sol[i][1] = y;
    	}
    	
    	Arrays.sort(sol, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);  // 두 번째 열 오름차순
            }
            return Integer.compare(a[0], b[0]);      // 첫 번째 열 오름차순
        });
    	
    	for (int j=0; j<N; j++) {
    		System.out.println(sol[j][0] + " " + sol[j][1]);
    	}
    	
    	scanner.close();
    }
}
