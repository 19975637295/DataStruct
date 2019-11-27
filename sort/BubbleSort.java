package sort;

public class BubbleSort {
	public static void Bubble(int[] arr) {
		if(arr.length<2||arr==null)
			return;
		for(int end=arr.length-1;end>0;end--)
			for(int j=0;j<end;j++)
			{
				if(arr[j]>arr[j+1])
					swap(arr,j,j+1);
			}
	}
	public static void swap(int[] arr, int i,int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
}
