package javaday10;

import java.util.HashMap;

public class hashMAPDEMO {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("sachin", "batsman");
		hm.put("dhoni", "wicketkeeper");
		hm.put("bumrah", "bolwer");
		hm.put("dhoni", "coach");
		hm.put("rohit", "batsman");
		
		System.out.println(hm);
		HashMap<Integer,String> hm1 = new HashMap<>();
		hm1.put(1, "manish");
		hm1.put(2, "ankit");
		hm1.put(3, "manish");
		hm1.put(4, "sourab");
		hm1.put(2, "john");
		
		System.out.println("hashmap :"+ hm1);
		HashMap<Integer,String> hm2 = new HashMap<>();
		hm2.put(1, "manish");
		hm2.put(1, "ankit");
		hm2.put(1, "manish");
		hm2.put(1, "sourab");
		hm2.put(1, "john");
		
		System.out.println("hashmap :"+ hm2);
	System.out.println("accesing the valiue useing key" +hm1.get(3));
	System.out.println("the access useing key :"+hm1.get(2));
	System.out.println("get the keys "+hm.values());
	
	}
	
	}
