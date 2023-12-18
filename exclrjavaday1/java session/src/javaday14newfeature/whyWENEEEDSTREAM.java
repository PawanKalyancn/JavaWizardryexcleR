package javaday14newfeature;

import java.util.ArrayList;

public class whyWENEEEDSTREAM {

	public static void main(String[] args) {

ArrayList<Integer> nums = new ArrayList<Integer>();
		
		//adding the numbers into arraylist
		for(int i=1;i<=10;i++)
		{
			nums.add(i);
		}
		
		System.out.println(nums);
		
		//1st way ( printing only even numbers using normal way)
		for(int num : nums)
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
		
		System.out.println("-----------using stream iterating the element----");
		nums.forEach(s->System.out.println(s));
		
		System.out.println("-----------using stream filtering and iterating the element----");
		nums.stream().filter(num->num%2==0).forEach(num->System.out.println(num));
		
	}

}