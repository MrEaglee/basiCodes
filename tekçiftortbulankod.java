package java1;

import java.util.Scanner;

public class tek�iftortbulankod {

	public static void main(String[] args) {

		int tektoplam, �ifttoplam, tekadet, �iftadet, i, sayi;

		float tekort, �iftort;

		Scanner reader = new Scanner(System.in);

		tekadet = 0;
		�iftadet = 0;
		tektoplam = 0;
		�ifttoplam = 0;

		for (i = 0; i < 10; i++) {
			System.out.print(i + ". sayi :");
			sayi = reader.nextInt();
			if (sayi % 2 == 0) {
				�iftadet++;
				�ifttoplam += sayi;
			} else {

				tekadet++;
				tektoplam += sayi;
			}
		}
		System.out.println(�iftadet + " �ift say� toplam� :" + �ifttoplam);
		System.out.println(tekadet + " tek say� toplam� =" + tektoplam);

		tekort = (float) tektoplam / tekadet;
		�iftort = (float) �ifttoplam / �iftadet;

		System.out.println("�ift say�lar�n ort :" + �iftort);
		System.out.println("tek say�lar�n ort : " + tekort);

	}

}
