package arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDEMo {
/*Array is staore to similar types of vaues
 * for storeing differnt types valeus to store we use collectrion
 * collections in java are 
 * 1.List(  -arraylist
 * 			-linkedlist)
 * 2.Set(hashset ,treeSet)(dont allow dupiclate)
 * 3.MApp(stores like key,value)
 * 	-hash map and tree map
 *	-tree map
 *all the above are interface we cant create objects
 *
 *
 *
 */	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("arraylist");
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		
		System.out.println("enter array values");
		int a[]= new int[size];
		for (int i = 0; i <a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("user entered values");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);//sort will defalut store in asceding order small to big
		System.out.println("Asecding order");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		System.out.println("descending order");
		for (int i =a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
		
		System.out.println("first laregest numb :"+a[a.length-1]);//fln
		System.out.println("first smallest numb :"+a[0]);//fsn
		
		System.out.println("2nd  laregest numb :"+a[a.length-2]);//Sln
		System.out.println("2nd smallest numb :"+a[1]);//Ssn
	//array list
	/*a[0]=1;
	a[1]=2;
	a[2]=3;

	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
*/
	}

}
