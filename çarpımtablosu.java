package java2;

import java.util.Scanner;

public class �arp�mtablosu {

	public static void main(String[] args) {

		int k = 0;

		while (k == 0) {

			Scanner input = new Scanner(System.in);
			System.out.println("L�tfen Bir Say� giriniz : ");
			int x = input.nextInt();
			for (int i = 1; i <= 10; i++) {
				System.out.println(x + "x" + i + "=" + (x * i));
			}

		}
	}

}
