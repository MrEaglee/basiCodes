package java2;

import java.util.Scanner;

public class Birdeğerekadartümasalsayılarıyazdırankod {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Üst Değer Limiti Giriniz : ");
		int deger = scan.nextInt();
		int kontrol = 0;

		if (deger < 2) {
			System.out.println("En kucuk asal sayi 2 dir.");
		}

		for (int i = 2; i <= deger; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					kontrol = 1;
				}
			}

			if (kontrol == 0) {
				System.out.println(i);
			} else {
				kontrol = 0;

			}
		}

	}

}
