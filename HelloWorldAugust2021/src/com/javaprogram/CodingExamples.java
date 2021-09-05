package com.javaprogram;

public class CodingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kata = "Hello World";
		String kataBaru = "Halo! Saya Aye";
		System.out.println(kata);
		System.out.println(kataBaru);
		
		int i = 10;
		int j = 12;
		
		System.out.println(i+j);
		System.out.println(kata + " " + kataBaru);
		System.out.println(kata + i + j);
		
		double hargaRonaldo = 10.5;
		
		System.out.println(hargaRonaldo + i);
		
		String gabunganKata = kata + " " + kataBaru;
		System.out.println(gabunganKata);
		System.out.println(gabunganKata.equalsIgnoreCase("Hello World Halo! Saya Aye"));
		System.out.println(gabunganKata.length());
		System.out.println(gabunganKata.substring(3, gabunganKata.length()));
		
		String checkRegex = "Pandemi 2021";
		System.out.println(checkRegex.replaceAll("[a-zA-Z]", ""));
		
		String namaMakanan = "Mie NasiGoreng Bakso Cilok Batagor MieAyam BuburAyam AyamKalasan Spaghetti Steak";
		String[] arrayNamaMakanan = namaMakanan.split(" ");
		/*
		 * System.out.println(arrayNamaMakanan[0]);
		 * System.out.println(arrayNamaMakanan[1]);
		 * System.out.println(arrayNamaMakanan[2]);
		 * System.out.println(arrayNamaMakanan[3]);
		 * System.out.println(arrayNamaMakanan[4]);
		 */

		for (int a = 3; a < arrayNamaMakanan.length; a++) {
			System.out.println(arrayNamaMakanan[a]);

}
		
		String menuItem = "//a[contains(text(),%s)]";

		System.out.println(String.format(menuItem, AppEnums.LOGIN.getString()));
		System.out.println(String.format(menuItem, "Register"));
		System.out.println(menuItem);

	}

}
