package sort;

public class HeapSort {
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	public static int parent(int child) {
		return (child-1)/2;
	}
	public static void sort(int[] arr) {
		if(arr==null||arr.length<2)
			return;
		for(int i=0;i<arr.length;i++) {
			heapInsert(arr, i);
		}
		int heapsize = arr.length;
		swap(arr, 0, --heapsize);
		while(heapsize>0) {
			heapify(arr, 0, heapsize);
			swap(arr, 0, --heapsize);
		}
	}
	public static void heapInsert(int arr[], int i) {
		while(arr[i]>arr[parent(i)]) {
			swap(arr, i, parent(i));
			i = parent(i);
		}
	}
	public static void heapify(int[] arr, int index, int size) {
		int left = index*2+1;
		while(left<size) {
			int largest = left;
			if(left+1<size)
				largest = arr[left]>arr[left+1]?left:left+1;
			largest = arr[index]>arr[largest]?index:largest;
			if(largest==index)
				break;
			swap(arr, index, largest);
			index = largest;
			left = index*2+1;
		}
	}
}
