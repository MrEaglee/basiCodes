import java.util.Scanner;

public class örnek21 {

	public static void main(String[] args) {

		System.out.println("Sayi : ");
		Scanner reader = new Scanner(System.in);
		int sayi = reader.nextInt();

		if (0 < sayi && 100 > sayi) {
			System.out.println("geçerli");
		} else
			System.out.println("geçersiz");

	}

}
