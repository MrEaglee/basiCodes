package java1;

import java.util.Scanner;

public class Gelirgidertablosu {

	public static void main(String[] args) {
		double i = 0;
		do {

			Scanner input = new Scanner(System.in);
			System.out.print("Lütfen Gelirinizi Yazýnýz : ");
			double Gelir = input.nextDouble();
			System.out.print("Lütfen Giderinizi Yazýnýz : ");
			double Gider = input.nextDouble();
			double Kar = Gelir - Gider;
			double Zarar = Gider - Gelir;

			if (Gelir >= Gider) {
				System.out.println("Kar : " + Kar + " TL");

			} else if (Gider > Gelir) {
				System.out.println("Zarar : " + Zarar + " TL");
			}

		} while (i == 0);

	}

}
