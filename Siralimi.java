package java2;

import java.util.Scanner;

public class Siralimi {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int sayi1, sayi2;
		boolean sirali = true;
		System.out.println("1.sayiyi giriniz :");
		sayi1 = reader.nextInt();
		for (int i = 2; i <= 10; i++) {
			System.out.println(i + ".Sayiyi Giriniz");
			sayi2 = reader.nextInt();

			if (sayi1 > sayi2) {

				sirali = false;
				
			}
				sayi1 = sayi2;

			
			if (sirali == true)
				System.out.println("Küçükten Büyüðe Doðru Sýralý");
			else
				System.out.println("Küçükten Büyüðe Doðru Sýralý Deðil");

		}
	}
}
