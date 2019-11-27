package sort;

import java.util.Arrays;

public class Vaild {
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			if(i%15==0&&i!=0)
				System.out.println(" ");
		}
		
	}
	public static void RightMethod(int[] arr) {
		Arrays.sort(arr);
	}
	public static int[] Gen_randomArr(int size, int value) {
		int[] ran = new int[(int) ((size+1)*Math.random())];
		for(int i=0;i<ran.length;i++) {
			ran[i] = (int) ((value+1)*Math.random());
		}
		return ran;
	}
	public static int[] copy(int arr[]) {
		if(arr==null)
			return null;
		else {
			int[] res = new int[arr.length];
			for(int i=0;i<arr.length;i++)
				res[i] = arr[i];
			return res;
		}
	}
	public static boolean vaild(int[] right, int[] your) {
		for(int i=0;i<right.length;i++)
			if(right[i]!=your[i])
				return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10;
		int value = 1000;
		int epochs = 10000;
		boolean success = true;
		for(int i=0;i<epochs;i++) {
			int[] arr1 = Gen_randomArr(size, value);
			int[] right = copy(arr1);
			RightMethod(right);
			//your_method
			//BubbleSort.Bubble(arr1);
			HeapSort.sort(arr1);
			if(!vaild(right, arr1)) {
				success = false;
				System.out.println("Your: ");
				printArr(arr1);
				System.out.println("");
				System.out.println("Right: ");
				printArr(right);
				System.out.println("");
				break;
			}
		}
		if(success) {
			System.out.print("right");
		}
		else {
			System.out.print("FUcK");
		}
			
	}
}
