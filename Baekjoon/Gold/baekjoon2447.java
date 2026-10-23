import java.util.*;

public class Main{
	public static void rec(int n, String s) {
		if (n == 1) {
			System.out.println(s);
		} else {
			String s1 = s;
			String sol = "";
			for (int i=0; i<s.length(); i+=n) {
				if (String.valueOf(s1.charAt(i)).equals(" ")) {
					sol = sol + " ".repeat(n);
				}
				else {
					sol = sol + ("*".repeat(n/3) + " ".repeat(n/3) + "*".repeat(n/3));
				}
			}
			rec(n/3, s);
			rec(n/3, sol);
			rec(n/3, s);
		}
	}
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner (System.in);
    	
    	int n = scanner.nextInt();
    	String s = "*".repeat(n);
    	rec(n, s);
    	
    	scanner.close();
    }
}
