package java2;

import java.util.Scanner;

public class enBüyüksayýyýgösterenkod {

	public static void main(String[] args) {

		int k = 0;

		while (k == 0) {

			Scanner input = new Scanner(System.in);
			System.out.print("Sayý Giriniz ? = ");
			int sayý1 = input.nextInt();
			System.out.print("Sayý Giriniz ? = ");
			int sayý2 = input.nextInt();
			System.out.print("Sayý Giriniz ? = ");
			int sayý3 = input.nextInt();
			int enBüyük = sayý1;

			if (enBüyük <= sayý2) {
				enBüyük = sayý2;

			}
			if (enBüyük <= sayý3) {
				enBüyük = sayý3;
			}

			System.out.println("En Büyük Sayý : " + enBüyük);

		}
	}

}
