package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapping {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Character, Integer> cNumber = new HashMap<>();
		System.out.println("Dimmi una parola: ");
		String input = in.nextLine();
		
		for(Character c : input.toLowerCase().toCharArray()) {
			
			if (cNumber.containsKey(c)) {
				
				cNumber.put(c, cNumber.get(c) + 1);
			} else {
				
				cNumber.put(c, 1);
			}
		}
		System.out.println(cNumber);
	}
}
