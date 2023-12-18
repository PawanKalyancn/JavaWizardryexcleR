package javaday10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
	    names.add("sachin");
	    names.add("dhoni");
	    names.add("dhoni");
	    names.add("bumrah");
	    names.add("shami");
	    
	    System.out.println("hashset (ownorder)  ="+names);
	    
	   LinkedHashSet<String> names2 = new LinkedHashSet<String>();
	   names2.add("sachin");
	   names2.add("dhoni");
	   names2.add("dhoni");
	   names2.add("bumrah");
	   names2.add("shami");
	    
	    System.out.println("LinkedHashSet (insertion order)  ="+names2);
	    
	    
	    TreeSet<String> names3 = new TreeSet<String>();
	    names3.add("sachin");
	    names3.add("dhoni");
	    names3.add("dhoni");
	    names3.add("bumrah");
	    names3.add("shami");
		    
		    System.out.println("TreeSet (sorted order)  ="+names3);
	}

}
