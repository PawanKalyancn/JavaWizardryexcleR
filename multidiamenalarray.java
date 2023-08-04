package day3java;

public class multidiamenalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		 //   System.out.println(arr1.length);
		  //  System.out.println(arr1[0].length);
		   // System.out.println(arr1[1].length);

		    for(int i=0;i<arr1.length;i++)
		    {
		    	for(int j=0;j<arr1[i].length;j++)
		    	{
		    		System.out.print(arr1[i][j] +" ");
		    	}
		    	
		    	System.out.println();
		    }
	}

}
