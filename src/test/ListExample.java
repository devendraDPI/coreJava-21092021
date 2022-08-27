package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList <String> ();
		//ArrayList<Object> list = new ArrayList <Object> ();
		
		list.add("Name0");
		list.add("Name1");
		list.add("Name2");
		list.add("Name2");
		/*list.add(null); Can't add null value*/
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		System.out.println(list.get(list.size()-1));
		// Iteration 1
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
		Iterator<String> itr = list.iterator();
		// Iteration 2
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		// Iteration 3
		for(String data:list) {
            System.out.println(data);
        }
		// Sort
		Collections.sort(list);
		System.out.println(list);
		
		// Reverse 1
		Collections.reverse(list);
		System.out.println(list);
		
		// Reverse 2
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		// LinkedList
		LinkedList<String> list1 = new LinkedList <String> ();
		
		list1.add("N0");
		list1.add("N1");
		list1.add("N2");
		
		list1.addFirst("N3");
		list1.addLast("N4");
		
		System.out.println(list1);
		
		// Stack
		Stack<String> stack = new Stack<String> ();
		
		stack.push("Nam0");
		stack.push("Nam1");
		stack.pop();
		stack.push("Nam2");
		stack.push("Nam3");
		stack.pop();
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		// Vector
		Vector<String> vector = new Vector <String> ();
		
		vector.add("Namea");
		vector.add("Nameb");
		vector.add("Namec");
		vector.add("Named");
		
		System.out.println(vector);

	}

}