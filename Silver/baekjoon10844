import java.util.*;

public class Main{

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int n = scanner.nextInt();

     //n만큼의 길이의 0~9로 끝나는 값을 저장하는 배열
    	int[][] sol = new int[n+1][10];

     //길이가 1일때는 0으로 시작 불가능 따라서 0은 0, 1~9는 1
    	sol[1][0] = 0;
    	for (int i=1; i<10; i++)
    		sol[1][i] = 1;
    		
    	// 끝이 0인 경우 1에서만 올 수 있고 끝이 9인경우 8에서만 올 수 있음
     // 나머지 경우 +1과 -1에서 올 수 음
    	for (int j=2; j<n+1; j++) {
    		for (int a=0; a<10; a++) {
    			if (a==0)
    				sol[j][a] = sol[j-1][1];
    			else if (a==9)
    				sol[j][a] = sol[j-1][8];
    			else {
    				sol[j][a] = (sol[j-1][a-1] + sol[j-1][a+1])%1000000000; 
    			}
    		}
    	}

     // 그 길이만큼의 값들을 모두 더함
    	int ans = 0;
    	for (int b=0; b<10; b++)
    		ans = (ans + sol[n][b])%1000000000;

    	System.out.println(ans);
    	
    	scanner.close();
    }
}
