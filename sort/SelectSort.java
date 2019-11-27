package sort;

public class SelectSort {
	public static void swap(int[] arr, int i,int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	public static void sort(int arr[]) {
		if(arr==null||arr.length<2)
			return;
		for(int i=0;i<arr.length;i++) {
			int index = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index = j;
				}
			}
			if(index!=i)
				swap(arr,i,index);
		}
	}
		
}
