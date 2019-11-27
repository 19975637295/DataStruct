package sort;

public class QuickSort {
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	public static void sort(int[] arr) {
		if(arr==null||arr.length<2)
			return;
		quickSort(arr, 0, arr.length-1);
	}
	public static void quickSort(int[] arr, int left, int right) {
		if(left<right) {
			swap(arr, right, left+(int)((right-left)*Math.random()));
			int p[] = partition(arr, left, right);
			quickSort(arr, left, p[0]);
			quickSort(arr, p[1], right);
		}
	}
	public static int[] partition(int[] arr, int left, int right) {
		int less = left-1;
		int pivot = arr[right];
		int more = right+1;
		while(left<more) {
			if(arr[left]==pivot) {
				left++;
			}else if(arr[left]<pivot) {
				swap(arr, ++less, left++);
			}else {
				more = more -1;
				swap(arr, more, left);
			}
		}
		return new int[] {less, more};
	}
	
}
