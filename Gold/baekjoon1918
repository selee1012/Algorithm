//중위 표기식을 입력 받고 후위 표기식으로 변겅

import java.util.*;

public class Main{

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	String input = scanner.nextLine();
    	
    	Stack<Character> opp = new Stack<>();
    	
    	for (int i=0; i<input.length(); i++) {
    		char che = input.charAt(i);
      // (라면 스택에 넣기
    		if (che == '(') {
    			opp.push(che);
    		} else if (che == ')') {
      // )라면 (가 나올때 까지 스택에서 제거하며 출력
    			while(opp.peek() != '(') {
    				System.out.print(opp.pop());
    			}
    			opp.pop();
       // *, /, +, - 라면 스택의 맨위의 연산자가 자기보다 우선순위가 빠르거나 같으면 먼저 제거 후 출력 아니라면 삽입
    		} else if (che == '*' || che == '/') {
    			while(!opp.isEmpty() && opp.peek() != '+' && opp.peek() != '-' && opp.peek() != '(') {
    				System.out.print(opp.pop());
    			}
    			opp.push(che);
    		} else if (che == '+' || che == '-') {
    			while  (!opp.isEmpty() && opp.peek() != '(') {
    				System.out.print(opp.pop());
    			}
    			opp.push(che);
       // 연산자에 포함되지 않으면 그냥 출력
    		} else {
    			System.out.print(che);
    		}
    	}

     //스택에 남아있는 요소 출력
    	while(!opp.isEmpty()) {
    		System.out.print(opp.pop());
    	}
    	
    	scanner.close();
    }
}
