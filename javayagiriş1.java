package java1;

import java.util.Scanner;

public class javayagiriş1 {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("İsminiz Nedir ?");
		String isim = klavye.next();
		System.out.println("Merhaba " + isim);
		System.out.println("Yaşınız Kaç ?");
		int yaş = klavye.nextInt();
		System.out.println("Şanslı Sayınız :");

		int şanslıSayı = 31;

		if (yaş > 31) {
			System.out.println(şanslıSayı);

		} else if (yaş <= 31) {
			System.out.println(şanslıSayı);

		}
		if (yaş < 14) {
			System.out.println(şanslıSayı);

		}
	}

}
