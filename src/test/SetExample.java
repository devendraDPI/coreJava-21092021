package test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset
		HashSet<String> set = new HashSet<String>();
		
		set.add("nme1");
		set.add("nme2");
		set.add("nme3");
		set.add("nme4");
		set.add("nme1");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		// LinkedHashSet
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		
		set1.add("nme11");
		set1.add("nme22");
		set1.add("nme33");
		set1.add("nme44");
		set1.add("nme11");
		set1.add(null);
		set1.add(null);
		
		System.out.println(set1);

	}

}