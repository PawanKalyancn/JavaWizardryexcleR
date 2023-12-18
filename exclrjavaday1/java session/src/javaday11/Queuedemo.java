package javaday11;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queuedemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		
	queue.add(1);
	queue.add(2);
	queue.add(3);
	queue.add(4);
	System.out.println("queue :"+queue);
	System.out.println("queue :"+ queue);

	System.out.println("returns top element from the queue :"+queue.peek()); 
	System.out.println("It remove the top elemnet from the queue :"+ queue.poll());

	System.out.println("queue" +queue); 
	System.out.println("It remove the top elemnet from the queue :"+ queue.poll());

	System.out.println("queue:"+ queue);

	System.out.println("tells empty or not queue :"+ queue.poll());
	System.out.println("It remove the top elesnet from the queue :"+ queue.isEmpty());

	System.out.println("queue:"+ queue);
	}

}
