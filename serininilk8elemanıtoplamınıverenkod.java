package java2;

public class serininilk8eleman�toplam�n�verenkod {

	public static void main(String[] args) {

		int fakt�riyel = 1;
		double t = 1.0;

		for (int n = 2; n <= 8; n++) {

			for (int k = 1; k <= (n + 1); k++) {

				fakt�riyel *= k;

			}

			t += (double) n / (double) fakt�riyel;
			fakt�riyel = 1;

		}

		System.out.println(t);

	}

}
