package java2;

import java.util.Scanner;

public class enB�y�ksay�y�g�sterenkod {

	public static void main(String[] args) {

		int k = 0;

		while (k == 0) {

			Scanner input = new Scanner(System.in);
			System.out.print("Say� Giriniz ? = ");
			int say�1 = input.nextInt();
			System.out.print("Say� Giriniz ? = ");
			int say�2 = input.nextInt();
			System.out.print("Say� Giriniz ? = ");
			int say�3 = input.nextInt();
			int enB�y�k = say�1;

			if (enB�y�k <= say�2) {
				enB�y�k = say�2;

			}
			if (enB�y�k <= say�3) {
				enB�y�k = say�3;
			}

			System.out.println("En B�y�k Say� : " + enB�y�k);

		}
	}

}
