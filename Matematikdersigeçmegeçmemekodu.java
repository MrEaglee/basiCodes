package java1;

import java.util.Scanner;

public class Matematikdersige�mege�memekodu {

	public static void main(String[] args) {
		int a = 0;
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("�lk S�nav Notunu Giriniz : ");
			int Note1 = input.nextInt();
			System.out.print("�kinci S�nav Notunu Giriniz : ");
			int Note2 = input.nextInt();
			System.out.print("���nc� S�nav Notunu Giriniz : ");
			int Note3 = input.nextInt();
			int ��lem = (Note1 + Note2 + Note3) / (3);
			System.out.println("Ortalama Notunuz :" + ��lem);

			if (��lem >= 80) {
				System.out.println("S�persin knks");
			} else if (��lem >= 50) {
				System.out.println("Dersi Ge�tiniz.");
			} else if (��lem <= 30) {
				System.out.println("Okulu B�rak Knks");
			} else if (��lem == 31) {
				for (int i = 0; i <= 100; i++) {
					System.out.println("sj");
				}
			} else {
				System.out.println("Dersten Kald�n�z.");
			}
		} while (a == 0);
	}

}
