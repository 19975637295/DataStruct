package sort;

public class MergeSort {
	public static void sort(int arr[]) {
		if(arr==null||arr.length<2)
			return;
		process(arr, 0, arr.length-1);
	}
	public static void process(int[] arr, int l, int r) {
		if(l==r)
			return;
		int mid = l+((r-l)>>1);//������6
		process(arr,l,mid);
		process(arr,mid+1,r);
		merge(arr,l,mid,r);
	}
	public static void merge(int[] arr, int l, int mid, int r) {
		int[] help = new int[r-l+1];
		int p1,p2;
		p1 = l;
		p2 = mid+1;
		int i=0;
		while(p1<=mid&&p2<=r) {
			if(arr[p1]>arr[p2])
				help[i]=arr[p2++];
			else
				help[i]=arr[p1++];
			i++;
		}
		while(p1<=mid) {
			help[i++] = arr[p1++];
		}
		while(p2<=r) {
			help[i++] = arr[p2++];
		}
		for(int j=0;j<help.length;j++) {
			arr[l+j]=help[j];
		}
	}
}
