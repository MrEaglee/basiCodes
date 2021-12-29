package java2;

import java.util.Scanner;

public class proje5 {

	public static void main(String[] args) {

		int i = 0;

		do {

			Scanner reader = new Scanner(System.in);
			System.out.print("Deðer1'i Giriniz :");
			int x = reader.nextInt();
			System.out.print("Deger2'i Giriniz :");
			int y = reader.nextInt();

			if (x > 0 && y > 0) {
				System.out.println("Birinci Bölgede");
			}

			else if (x < 0 && y > 0) {
				System.out.println("Ýkinci Bölgede");
			}

			else if (x < 0 && y < 0) {
				System.out.println("Üçüncü Bölgede");
			} else if (x == 0 && y == 0) {

				System.out.println("Orjinde");

			}

			else {
				System.out.println("Dördüncü Bölgede");
			}

		} while (i == 0);

	}

}
