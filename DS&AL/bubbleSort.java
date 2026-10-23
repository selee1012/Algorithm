//int 범위 이내의 정수 기준으로 구현
public class bubbleSort {
	public static int[] bubbleSort1(int[] a) {
		for (int i=a.length-1; i >= 0; i--) {
			int temp;

			for (int j=0; j < i; j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		
		return a;
	}
}
