package List;

public class Print {
	public void Quan(int[][] arr) {
		
	}
	public void Zhi(int[][] arr) {
		
	}
	public static void PrintBoder(int[][] arr, int row1, int col1, int row2, int col2) {
		int i, j;
		i = row1;
		j = col1;
		while(i!=col2) {
			System.out.print(arr[i++][j]);
			//System.out.print(i+","+j+" ");
			//i++;
		}
			
		
		while(j!=row2) {
			System.out.print(arr[i][j++]);
			//System.out.print(i+","+j+" ");j++;
		}
			
		
		while(i!=col1) {
			System.out.print(arr[i--][j]);
			//System.out.print(i+","+j+" ");i--;
		}
			
		
		while(j!=row1) {
			System.out.print(arr[i][j--]);
			//System.out.print(i+","+j+" ");j--;
		}
			

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col;
		row = col = 3;
		int arr[][] = new int[row][col];
		for(int i = 0;i<row;i++)
			for(int j =0;j<col;j++) {
				arr[i][j] = j;
			}
		PrintBoder(arr, 0, 0, row-1, col-1);
	}

}
