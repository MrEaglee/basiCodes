package java2;

import java.util.Scanner;

public class birdennyekadarolansayýlarýntoplamýnýverenkod {

	public static void main(String[] args) {

		int k = 0;

		while (k == 0) {

			Scanner reader = new Scanner(System.in);
			System.out.print("Bir Sayý Giriniz : ");
			long sayý = reader.nextLong();

			long toplam = 0;

			for (long i = 1; i <= sayý; i++) {

				toplam = toplam + i;

			}

			System.out.println("Sonuc : " + toplam);

		}

	}

}
