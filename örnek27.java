import java.util.Scanner;

public class �rnek27 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Saat : ");
		double saat = reader.nextDouble();
		System.out.print("Saat �creti : ");
		double �cret = reader.nextDouble();
		double maas;

		if (saat < 40) {

			maas = saat * �cret;

			System.out.println("Maa� : " + maas);
		} else if (saat > 40) {

			maas = ((saat - 40) * 2 * �cret) + (40 * �cret);
			System.out.println("Maa� : " + maas);

		} else {
			System.out.println("Ge�erli Bir De�er Giriniz : ");
		}

	}

}
