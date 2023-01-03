package notes07_HashMaps;

import java.util.HashMap;

/*
 * HashMaps Notes
 * 
 * HashMap( <Key> / <Value> ) 
 * 
 * Arrays are an index/value storage system
 * 
 */

public class Notes_HashMaps {

	public static void main(String[] args) {
		
		HashMap<String, Integer> houseNumbers = new HashMap<String, Integer>();
		
		houseNumbers.put("Joe", 72);
		houseNumbers.put("Candace", 381);
		houseNumbers.put("Pancake", 632);
		
		System.out.println(houseNumbers.get("Joe") + "\n");
		
		
		for(String key : houseNumbers.keySet()) {
			System.out.println(key + " = " + houseNumbers.get(key));
		}
		System.out.println("\nNumber of Values = " + houseNumbers.size());
		
		
		/*
		 * removing
		 */
		houseNumbers.remove("Joe");
		System.out.println();
		for(String key : houseNumbers.keySet()) {
			System.out.println(key + " = " + houseNumbers.get(key));
		}
		
		System.out.println("\nNumber of Values = " + houseNumbers.size());
		
		
		
		//Loop through Values
		System.out.println();
		for (int num : houseNumbers.values()) {
			System.out.println(num);
		}
		
	}
	
}
