package java2;

public class serininilk8elemanýtoplamýnýverenkod {

	public static void main(String[] args) {

		int faktöriyel = 1;
		double t = 1.0;

		for (int n = 2; n <= 8; n++) {

			for (int k = 1; k <= (n + 1); k++) {

				faktöriyel *= k;

			}

			t += (double) n / (double) faktöriyel;
			faktöriyel = 1;

		}

		System.out.println(t);

	}

}
