import java.util.Scanner;

public class örnek27 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Saat : ");
		double saat = reader.nextDouble();
		System.out.print("Saat Ücreti : ");
		double ücret = reader.nextDouble();
		double maas;

		if (saat < 40) {

			maas = saat * ücret;

			System.out.println("Maaþ : " + maas);
		} else if (saat > 40) {

			maas = ((saat - 40) * 2 * ücret) + (40 * ücret);
			System.out.println("Maaþ : " + maas);

		} else {
			System.out.println("Geçerli Bir Deðer Giriniz : ");
		}

	}

}
