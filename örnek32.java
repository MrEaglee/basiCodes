import java.util.Scanner;

public class �rnek32 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int toplam = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Say� Giriniz : ");
			int sayi = reader.nextInt();

			toplam = toplam + sayi;

		}

		System.out.println(toplam);

	}

}
