package java2;

import java.util.Scanner;

public class üsalmakodu {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Üssünü Almak Ýstediðinz Sayýyý Giriniz : ");
		int Sayý = reader.nextInt();
		System.out.print("Üssü Giriniz : ");
		int üs = reader.nextInt();

		long sonuc = 1;

		for (; üs != 0; --üs) {

			sonuc *= Sayý;

		}
		System.out.println("Cevap :" + sonuc);
	}

}
