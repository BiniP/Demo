package com.sansa.class5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListHash {

	public static void main(String[] args) {
		HashMap<String,User>hm=new HashMap<String,User>();
		User u=new User();
		User u1=new User();
		
		hm.put("M", u);
		hm.put("T",u1);
		ArrayListHash ah=new ArrayListHash();
		ArrayList<User>au=ah.acceptHash(hm);
		
	}
	public ArrayList<User> acceptHash(HashMap<String,User> hm){
		ArrayList<User>a=new ArrayList<User>();
		for (Map.Entry entry : hm.entrySet()) {
		    System.out.println(entry.getKey() + ", " + entry.getValue());
		
			if (hm.get("M").startsWith("A") | as.get(i).startsWith("E") | as.get(i).startsWith("I")
					| as.get(i).startsWith("O") | as.get(i).startsWith("U")) {
				System.out.println(as.get(i));

			}

		}
		return a;
		
		
		
	}

}
