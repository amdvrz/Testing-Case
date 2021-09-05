package com.javaprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();

		names.add("andro");
		names.add("andika");
		names.add("adlan");
		names.add("dhiny");
		names.add("ahmad");
		names.add(3, "dono");
		names.remove(4);

		for (String item : names) {
			System.out.println(item);
		}
		System.out.println(names.size());
		
		//set
		HashSet<Integer> rollNumbers = new HashSet <>();
		rollNumbers.add(100);
		rollNumbers.add(101);
		rollNumbers.add(102);
		
		for (Integer item : rollNumbers) {
			System.out.println(item);
		}
		
		//contohMaps
		HashMap<Integer,String> studentIds = new HashMap<>();
		studentIds.put(8, "Aye");
		studentIds.put(10, "Dono");
		studentIds.put(7, "Adlan");
		studentIds.put(23, "Ferry");
		studentIds.remove(10);
		
		System.out.println(studentIds.get(10));
		for (Integer key : studentIds.keySet()) {
			System.out.println("Key is : " + key + " and the name is " + studentIds.get(key));
		}
		
		HashMap<String, String> minumanFavorit = new HashMap<String, String>();
		minumanFavorit.put("Es Jeruk", "Cappucino");
		minumanFavorit.put("Es Mambo", "Es Campur");
		minumanFavorit.put("Es Teler", "Es Matcha");
		
		System.out.println(minumanFavorit.get("Es Jeruk"));
		for (String key : minumanFavorit.keySet()) {
			System.out.println("Key is : " + key + " and the name is " + minumanFavorit.get(key));
		}
	
	}

}
