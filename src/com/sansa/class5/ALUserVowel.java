package com.sansa.class5;

import java.util.ArrayList;

public class ALUserVowel {

	public static void main(String[] args) {
		ALUserVowel av = new ALUserVowel();
		ArrayList<String> as = new ArrayList<String>();
		as.add("Adam");
		as.add("Tom");
		as.add("Edan");
		as.add("Oliver");
		ArrayList<String> arv = av.arrayListVowel(as);

	}

	public ArrayList<String> arrayListVowel(ArrayList<String> as) {
		ArrayList<String> arv = new ArrayList<String>();

		for (int i = 0; i < as.size(); i++) {
			if (as.get(i).startsWith("A") | as.get(i).startsWith("E") | as.get(i).startsWith("I")
					| as.get(i).startsWith("O") | as.get(i).startsWith("U")) {
				System.out.println(as.get(i));

			}

		}
		return arv;

	}
}
