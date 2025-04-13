import.java.util.*;

//int 범위 이내의 정수 기준으로 구현
public class quickSort {
	public static int[] quickSort1(int[] a) {
		if (a.length <= 1)
			return a;
		
		int r = a[a.length-1];
		int temp;
		int i=0;
				
		for (int j=0; j<a.length-1; j++) {
			if (a[j] < r) {
				if (i!=j) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				i++;
			}
		}
		temp = a[i];
		a[i] = r;
		a[a.length-1] = temp;
		
		List<Integer> sorted = new ArrayList<>();
		
		if (i != 0) {
			int[] left = quickSort1(Arrays.copyOfRange(a, 0, i));
			for (int in:left)
				sorted.add(in);
		}
		
		sorted.add(a[i]);
		
		if  (i+1 < a.length) {
			int[] right = quickSort1(Arrays.copyOfRange(a, i+1, a.length));
			for (int in2:right)
				sorted.add(in2);
		}
		
		int[] sol = new int[sorted.size()];

		for (int x = 0; x < sorted.size(); x++) {
		    sol[x] = sorted.get(x);
		}
        
		return sol;
	}
}
