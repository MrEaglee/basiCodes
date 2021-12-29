package java2;

import java.util.Scanner;

public class stringitersçevirenkod {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		String str = reader.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));
		}

	}

}
