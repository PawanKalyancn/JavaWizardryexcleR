package javaday10;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(2);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(3);
		stack.push(5);
		stack.push(3);
		stack.pop();
		System.out.println("the stach has"+stack);
		for(int num :stack)
		{
			System.out.println(num);
		}

	for ( int num1 :stack)
	{
		if(num1==3)
		{
			System.out.println("zekee");
		}
		else
		{
			System.out.println("eren yeager");
		}
	}
	
	
	}

}
