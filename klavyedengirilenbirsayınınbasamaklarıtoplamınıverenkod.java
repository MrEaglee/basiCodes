package java2;

import java.util.Scanner;

public class klavyedengirilenbirsayınınbasamaklarıtoplamınıverenkod {

	public static void main(String[] args) {

		int k = 0;

		while (k == 0) {

			Scanner reader = new Scanner(System.in);
			System.out.println("Bir Sayı Giriniz : ");
			int sayi = reader.nextInt();

			int toplam = 0, adet = 0;

			while (sayi != 0) {
				toplam = (sayi % 10) + toplam;
				sayi /= 10;
				adet++;

			}
			System.out.println("Basamak Toplamı :" + toplam);

		}

	}
}
