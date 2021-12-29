package java2;

import java.util.Scanner;

public class çalýþmasorusu4 {

	public static void main(String[] args) {

		int i = 0;

		while (i == 0) {

			Scanner reader = new Scanner(System.in);
			System.out.print("Klavyeden String Giriniz : ");

			String str = reader.nextLine();

			char karakter = str.charAt(0);
			char karakter2 = str.charAt(str.length() - 1);

			if ((karakter == 'a' || karakter == 'A') && karakter2 == 'z' || karakter2 == 'Z') {
				System.out.println(str);

			} else if (karakter == 'q' || karakter == 'Q') {
				System.exit(1);
			}
		}
	}

}
