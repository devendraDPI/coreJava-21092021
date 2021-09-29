package test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PriorityQueue
		PriorityQueue<String> queue1 = new PriorityQueue <String> ();
		
		queue1.add("n1");
		queue1.add("n2");
		queue1.add("n3");
		queue1.add("n4");
		queue1.add("n4");
		/*queue1.add(null); Can't add null value*/
		
		System.out.println(queue1);
		
		System.out.println(queue1.peek());
		
		System.out.println(queue1.poll());
		
		//String first = queue1.poll();
		
		System.out.println(queue1);
		
		// Dequeue
		ArrayDeque<String> queue2 = new ArrayDeque <String> ();
		
		queue2.add("nm1");
		queue2.add("nm2");
		queue2.add("nm3");
		queue2.add("nm4");
		queue2.addFirst("nm5");
		queue2.addLast("nm6");
		
		System.out.println(queue2);
		
		System.out.println(queue2.peekFirst());
		
		System.out.println(queue2.peekLast());

	}

}