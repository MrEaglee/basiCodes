package java1;

import java.util.Scanner;

public class Matematikdersigeçmegeçmemekodu {

	public static void main(String[] args) {
		int a = 0;
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("Ýlk Sýnav Notunu Giriniz : ");
			int Note1 = input.nextInt();
			System.out.print("Ýkinci Sýnav Notunu Giriniz : ");
			int Note2 = input.nextInt();
			System.out.print("Üçüncü Sýnav Notunu Giriniz : ");
			int Note3 = input.nextInt();
			int Ýþlem = (Note1 + Note2 + Note3) / (3);
			System.out.println("Ortalama Notunuz :" + Ýþlem);

			if (Ýþlem >= 80) {
				System.out.println("Süpersin knks");
			} else if (Ýþlem >= 50) {
				System.out.println("Dersi Geçtiniz.");
			} else if (Ýþlem <= 30) {
				System.out.println("Okulu Býrak Knks");
			} else if (Ýþlem == 31) {
				for (int i = 0; i <= 100; i++) {
					System.out.println("sj");
				}
			} else {
				System.out.println("Dersten Kaldýnýz.");
			}
		} while (a == 0);
	}

}
