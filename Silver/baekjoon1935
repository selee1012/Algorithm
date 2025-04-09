import java.util.*;

public class Main{

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int n = scanner.nextInt();

     //줄바꿈
     scanner.nextLine();
    	
    	String input = scanner.nextLine();

     // 결과가 -20억~20억이기 때문에 double을 사용해야 함
    	Stack<Double> opp = new Stack<>();
    	
    	long[] save = new long[n];
    	
    	for (int i=0; i<n; i++) {
    		save[i] = scanner.nextInt();
    	}
    	
    	for (int j=0; j<input.length(); j++) {
    		char che = input.charAt(j);
    		if (che == '+' || che == '-' || che == '*' || che == '/') {
    			double b = opp.pop();
    			double a = opp.pop();
    			switch (che) {
    			case '+' :
    				opp.push(a + b);
    				break;
    			case '-' :
    				opp.push(a - b);
    				break;
    			case '*' :
    				opp.push(a * b);
    				break;
    			case '/' :
    				opp.push(a / b);
    				break;
    			}
    		} else {
    			opp.push((double)save[che - 'A']); 
    		}
    	}

     //소수점 둘째자리까지만 출력
    	System.out.printf("%.2f\n", opp.peek());
    	
    	scanner.close();
    }
}
