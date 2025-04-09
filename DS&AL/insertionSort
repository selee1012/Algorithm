//int 범위 이내의 정수 기준으로 구현
public class insertionSort {
	public static int[] insertionSort1(int[] a) {
		int[] sol = new int[a.length];
		
		for (int i=0; i<a.length; i++) {
			if (i==0) {
				sol[i] = a[i];
				continue;
			}
				
			int j = i-1;
			
			while (j >= 0 && sol[j] > a[i]) {
				sol[j+1] = sol[j];
				j--;
			}
			sol[j+1] = a[i];
		}
		
		return sol;
	}
}
