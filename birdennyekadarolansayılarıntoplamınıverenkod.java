package java2;

import java.util.Scanner;

public class birdennyekadarolansay�lar�ntoplam�n�verenkod {

	public static void main(String[] args) {

		int k = 0;

		while (k == 0) {

			Scanner reader = new Scanner(System.in);
			System.out.print("Bir Say� Giriniz : ");
			long say� = reader.nextLong();

			long toplam = 0;

			for (long i = 1; i <= say�; i++) {

				toplam = toplam + i;

			}

			System.out.println("Sonuc : " + toplam);

		}

	}

}
