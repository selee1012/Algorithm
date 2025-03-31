import java.util.*;

public class Main{

    // 범위가 0~9까지의 수로 범위가 적은 정수이기 때문에 계수정렬 활용
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String input = sc.next();
    	
    	int[] n = new int[10];
    	
    	for (int i=0; i<input.length(); i++) {
    		int index = Integer.parseInt(String.valueOf(input.charAt(i)));
    		n[index] += 1;
    	}
    	
    	for (int j=9; j>=0; j--) {
    		while (n[j] > 0) {
    			System.out.print(j);
    			n[j] -= 1;
    		}
    	}

    	
    	sc.close();
    }
}
