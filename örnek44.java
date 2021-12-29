
public class örnek44 {

	public static void main(String[] args) {

		int toplam = 0;
		int sayac = 0;
		int i;
		for (i = 8; i < 27; i = i++) {

			if (i % 2 != 0) {

				sayac++;
				toplam = i + toplam;
			}

		}
		System.out.println(toplam);

		System.out.println((double) (toplam) / (double) sayac);

	}

}
