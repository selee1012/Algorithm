import java.util.*;

public class Main{

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int N = scanner.nextInt();
    	scanner.nextLine();

     //단어로 인한 정렬과 중복 제거를 한 번에
    	Set<String> temp = new TreeSet<>();
    	
    	for (int i=0; i<N; i++) {
    		temp.add(scanner.nextLine());
    	}
    	
    	String[] sol = new String[temp.size()]; 
    	int index = 0;
    	for (String s : temp) {
    	    sol[index++] = s;
    	}

     //이미 단어에 따른 정렬은 되어 있기 때문에 길이에 따라서 다시 정렬하면 길이가 같을 경우 단어로 정렬돼 있음
    	Arrays.sort(sol, (a, b) -> Integer.compare(a.length(), b.length()));
           
    	for (int j=0; j<sol.length; j++) {
    		System.out.println(sol[j]);
    	}
    	
    	scanner.close();
    }
}
