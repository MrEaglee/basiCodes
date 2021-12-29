package java1;

import java.util.Scanner;

public class tekçiftortbulankod {

	public static void main(String[] args) {

		int tektoplam, çifttoplam, tekadet, çiftadet, i, sayi;

		float tekort, çiftort;

		Scanner reader = new Scanner(System.in);

		tekadet = 0;
		çiftadet = 0;
		tektoplam = 0;
		çifttoplam = 0;

		for (i = 0; i < 10; i++) {
			System.out.print(i + ". sayi :");
			sayi = reader.nextInt();
			if (sayi % 2 == 0) {
				çiftadet++;
				çifttoplam += sayi;
			} else {

				tekadet++;
				tektoplam += sayi;
			}
		}
		System.out.println(çiftadet + " çift sayý toplamý :" + çifttoplam);
		System.out.println(tekadet + " tek sayý toplamý =" + tektoplam);

		tekort = (float) tektoplam / tekadet;
		çiftort = (float) çifttoplam / çiftadet;

		System.out.println("çift sayýlarýn ort :" + çiftort);
		System.out.println("tek sayýlarýn ort : " + tekort);

	}

}
