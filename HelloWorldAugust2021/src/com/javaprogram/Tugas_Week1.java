//28 Agustus 2021
package com.javaprogram;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.*;

public class Tugas_Week1 {
	public static void main(String[] args) {
		//TreeMap
		SortedMap<String, String> kelurahanJakarta  = new TreeMap<>();
		
		kelurahanJakarta.put("Johar Baru", "Jakarta Pusat");
		kelurahanJakarta.put("Pancoran", "Jakarta Selatan");
		kelurahanJakarta.put("Tanjung Priok", "Jakarta Utara");
		kelurahanJakarta.put("Penggilingan", "Jakarta Timur");
		kelurahanJakarta.put("Kedoya", "Jakarta Barat");
		
		System.out.println(kelurahanJakarta.get("Johar Baru"));
		for (String key : kelurahanJakarta.keySet()) {
			System.out.println("Kelurahan " + key + " berada di " + kelurahanJakarta.get(key));
		}
		
		//TreeSet
		Set<String> namaBuah = new TreeSet<>();
		 
        namaBuah.add("Apel");
        namaBuah.add("Bengkoang");
        namaBuah.add("Ceri");
        namaBuah.add("Durian");
 
        System.out.println(namaBuah);
	}
	
}
