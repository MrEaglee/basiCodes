package java1;

import java.util.Scanner;

public class Faktöriyelhesabıyapankod {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz : ");
		int y = input.nextInt();
		int x = 1;

		for (int i = 1; i <= y; i++) {

			x = x * i;

		}

		System.out.println(x);

	}

}
