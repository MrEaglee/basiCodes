package java2;

import java.util.Scanner;

public class atmpara�ekme {

	public static void atm() {

		Scanner reader = new Scanner(System.in);
		System.out.println("�ifrenizi Tekrar Giriniz : ");
		int password = reader.nextInt();

	}

	public static void main(String[] args) {

		System.out.println("Kart�n�z� yerle�tiriniz");
		Scanner reader = new Scanner(System.in);
		System.out.println("�ifrenizi Giriniz : ");
		int password = reader.nextInt();

		if (password == 1453) {
			System.out.println("Giri� Ba�ar�l�");

			System.out.println(
					"L�tfen yapaca��n� ��lemi Se�iniz(Para �ekme = 1/Para Yat�rma=2/Bakiye Sorgulama=3/Default: Kart�n�z� Al�n�z");

			int i�lem = reader.nextInt();

			double balance = 1000;
			double toplam;

			switch (i�lem) {
			case 1:
				System.out.print("�ekmek �stedi�iniz Tutar� Giriniz : ");
				double �ekme = reader.nextDouble();
				toplam = balance - �ekme;
				System.out.println("Kalan Paran�z : " + toplam);
				break;
			case 2:
				System.out.print("Yat�rmak isted�iniz Tutar� Giriniz :");
				double yat�rma = reader.nextDouble();
				toplam = balance + yat�rma;
				System.out.println("Toplam Paran�z : " + toplam);
				break;
			case 3:
				System.out.println(balance);
				System.out.println("Yapmak istedi�iniz Ba�ka ��lem Yoksa Kart�n�z� Al�n�z");
				break;
			default:
				System.out.println("L�tfen Kart�n�z� Al�n�z");
			}

		}

		else {
			System.out.println("Giri� Ba�ar�s�z Kart�n�z Kapat�lm��t�r ");
		}

	}

}
