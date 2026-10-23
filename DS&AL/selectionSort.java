// int 범위 이내의 정수 기준으로 구현
public class selectionSort {
	public static int[] selectionSort1(int[] a) {
		
		for (int i=a.length-1; i >= 0; i--) {
			int max = a[0];
			int index = 0;

			for (int j=1; j<=i; j++) {
				if (max < a[j]) {
					max = a[j];
					index = j;
				}
			}
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
		}
		
		return a;
	}
}
