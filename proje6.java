package java2;

import java.util.Scanner;

public class proje6 {

	public static void main(String[] args) {

		int i = 0;
		while (i == 0) {

			Scanner reader = new Scanner(System.in);
			System.out.print("Say�1 Giriniz : ");
			int a1 = reader.nextInt();
			System.out.print("Say�2 Giriniz : ");
			int a2 = reader.nextInt();
			System.out.print("Say�3 Giriniz : ");
			int a3 = reader.nextInt();
			System.out.print("Say�4 Giriniz : ");
			int a4 = reader.nextInt();
			System.out.print("Say�5 Giriniz : ");
			int a5 = reader.nextInt();
			System.out.print("Say�6 Giriniz : ");
			int a6 = reader.nextInt();
			System.out.print("Say�7 Giriniz : ");
			int a7 = reader.nextInt();
			System.out.print("Say�8 Giriniz : ");
			int a8 = reader.nextInt();
			System.out.print("Say�9 Giriniz : ");
			int a9 = reader.nextInt();
			System.out.print("Say�10 Giriniz : ");
			int a10 = reader.nextInt();

			if (a1 == a2 && a2 == a3 && a3 == a4 && a4 == a5 && a5 == a6 && a6 == a7 && a7 == a8 && a8 == a9
					&& a9 == a10) {
				System.out.println("S�ral� De�ildir");
			} else if (a2 - a1 == a3 - a2 && a4 - a3 == a5 - a4 && a6 - a5 == a7 - a6 && a8 - a7 == a9 - a8
					&& a10 - a9 == a2 - a1) {
				System.out.println("S�ral�d�r");

			}

			else {
				System.out.println("S�ral� De�ildir");
			}
		}

	}

}
