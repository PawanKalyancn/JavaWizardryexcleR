package day3java;

public class multidiamentindemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int arr[][] = new int [5][4];
		
		arr[2][3]=1;
		//arr[4][5]=1;
	//	arr[4][6]=1;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			
			System.out.println();
		}
	}

}
