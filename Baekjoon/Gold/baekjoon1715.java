import java.util.*;

public class Main{

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int N = scanner.nextInt();

     //우선순위 큐 사용
    	PriorityQueue<Integer> input = new PriorityQueue<>();
    	
    	for (int i=0; i<N; i++) {
    		input.add(scanner.nextInt());
    	}

     //가장 작은 값 2개를 먼저 합치고 합쳐지 더미는 다시 넣음
    	int sol=0;
    	while (input.size() != 1) {
    		int temp = input.poll() + input.poll();
    		sol += temp;
    		input.add(temp);
    	}
    	
    	System.out.println(sol);
    	
    	scanner.close();
    }
}
