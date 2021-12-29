package java2;

import java.util.Scanner;

public class proje4 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int i = 1;

		for (i = 1; i < 10; i++) {

			double note1;
			double note2;
			double note3;
			System.out.print("Note1 Giriniz : ");
			note1 = reader.nextDouble();
			System.out.print("Note2 Giriniz : ");
			note2 = reader.nextDouble();
			System.out.print("Note3 Giriniz : ");
			note3 = reader.nextDouble();

			double ort = note1 + note2 + note3;

			if (ort > 50) {
				System.out.println("Geçtiniz");
			}

			else if (ort < 50) {
				System.out.println("Geçemediniz");
			} else {
				System.out.println("Geçerli Sayý Giriniz");
			}

		}

	}

}
