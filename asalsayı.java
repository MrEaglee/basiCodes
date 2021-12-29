package java1;

import java.util.Scanner;

public class asalsayý {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.println("Pozifif bir tam sayý Giriniz");
		int i;
		int bolenSayac = 0;
		int j;

		for (i = k.nextInt(); i < 1000; i++) {

			for (j = 2; j < i; j++) {
				if (i % j == 0)
					bolenSayac++;
			}
			if (bolenSayac == 0)
				System.out.print(i + "-");
			bolenSayac = 0;
		}

	}

}
