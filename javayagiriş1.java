package java1;

import java.util.Scanner;

public class javayagiri�1 {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("�sminiz Nedir ?");
		String isim = klavye.next();
		System.out.println("Merhaba " + isim);
		System.out.println("Ya��n�z Ka� ?");
		int ya� = klavye.nextInt();
		System.out.println("�ansl� Say�n�z :");

		int �ansl�Say� = 31;

		if (ya� > 31) {
			System.out.println(�ansl�Say�);

		} else if (ya� <= 31) {
			System.out.println(�ansl�Say�);

		}
		if (ya� < 14) {
			System.out.println(�ansl�Say�);

		}
	}

}
