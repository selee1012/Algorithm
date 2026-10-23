//int 범위 이내의 정수 기준으로 구현
public class mergeSort {
	public static int[] mergeSort1(int[] a) {
		if (a.length <= 1)
			return a;
		
		int div = a.length/2;
		int[] front = new int[div];
		int[] back = new int[a.length-div];
		
		for (int i=0; i<div; i++) {
			front[i] = a[i];
		}
		for (int j=0; j<a.length-div; j++) {
			back[j] = a[div+j];
		}
		
		return merge(mergeSort1(front), mergeSort1(back));
	}
	
	public static int[] merge (int[] a, int[] b) {
		int[] sol = new int[a.length + b.length];
		
		int index = 0;
		int i = 0;
		int j = 0;
		
		while (i < a.length && j < b.length) {
			if (a[i] > b[j]) {
				sol[index++] = b[j++];
			} else {
				sol[index++] = a[i++];
			}
		}
		while (i < a.length)
			sol[index++] = a[i++];
		while (j < b.length)
			sol[index++] = b[j++];
		
		return sol;
	}
}
