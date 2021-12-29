package java2;

import java.util.Scanner;

public class atmparaçekme {

	public static void atm() {

		Scanner reader = new Scanner(System.in);
		System.out.println("Þifrenizi Tekrar Giriniz : ");
		int password = reader.nextInt();

	}

	public static void main(String[] args) {

		System.out.println("Kartýnýzý yerleþtiriniz");
		Scanner reader = new Scanner(System.in);
		System.out.println("Þifrenizi Giriniz : ");
		int password = reader.nextInt();

		if (password == 1453) {
			System.out.println("Giriþ Baþarýlý");

			System.out.println(
					"Lütfen yapacaðýný Ýþlemi Seçiniz(Para çekme = 1/Para Yatýrma=2/Bakiye Sorgulama=3/Default: Kartýnýzý Alýnýz");

			int iþlem = reader.nextInt();

			double balance = 1000;
			double toplam;

			switch (iþlem) {
			case 1:
				System.out.print("Çekmek Ýstediðiniz Tutarý Giriniz : ");
				double çekme = reader.nextDouble();
				toplam = balance - çekme;
				System.out.println("Kalan Paranýz : " + toplam);
				break;
			case 2:
				System.out.print("Yatýrmak istedðiniz Tutarý Giriniz :");
				double yatýrma = reader.nextDouble();
				toplam = balance + yatýrma;
				System.out.println("Toplam Paranýz : " + toplam);
				break;
			case 3:
				System.out.println(balance);
				System.out.println("Yapmak istediðiniz Baþka Ýþlem Yoksa Kartýnýzý Alýnýz");
				break;
			default:
				System.out.println("Lütfen Kartýnýzý Alýnýz");
			}

		}

		else {
			System.out.println("Giriþ Baþarýsýz Kartýnýz Kapatýlmýþtýr ");
		}

	}

}
