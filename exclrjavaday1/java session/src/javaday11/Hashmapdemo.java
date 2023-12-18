package javaday11;

import java.util.HashMap;

public class Hashmapdemo {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("sachin", "batsman");
		hm.put("dhoni", "wicketkeeper");
		hm.put("bumrah", "bolwer");
		hm.put("dhoni", "coach");
		hm.put("rohit", "batsman");
		
		System.out.println(hm);
	}

}
