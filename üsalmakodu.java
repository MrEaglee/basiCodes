package java2;

import java.util.Scanner;

public class �salmakodu {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("�ss�n� Almak �stedi�inz Say�y� Giriniz : ");
		int Say� = reader.nextInt();
		System.out.print("�ss� Giriniz : ");
		int �s = reader.nextInt();

		long sonuc = 1;

		for (; �s != 0; --�s) {

			sonuc *= Say�;

		}
		System.out.println("Cevap :" + sonuc);
	}

}
