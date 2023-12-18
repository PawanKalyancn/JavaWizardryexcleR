package javaday9;

import java.util.ArrayList;

public class ITeratrecollectindemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("=============iterate integer===============");
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		nums.add(3);
		System.out.println("num1 :"+ nums);
		//iterating the stack
		for(Integer num : nums) {
			System.out.println(num);
		}
		
		for(int num1 :nums) {
			if(num1==3) {
				System.out.println("hekloo world");
			}
			else
			{
				System.out.println("eren yeager");
			}
		
		}
		
	}

}
