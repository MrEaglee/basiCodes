import java.util.Scanner;

public class �rnek21 {

	public static void main(String[] args) {

		System.out.println("Sayi : ");
		Scanner reader = new Scanner(System.in);
		int sayi = reader.nextInt();

		if (0 < sayi && 100 > sayi) {
			System.out.println("ge�erli");
		} else
			System.out.println("ge�ersiz");

	}

}
