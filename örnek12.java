import java.util.Scanner;

public class örnek12 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Vize Notunu Giriniz : ");
		int vize = reader.nextInt();
		System.out.println("Final Notunu Giriniz : ");
		int fnl = reader.nextInt();
		
		int sonuc = (vize*30/100) + (fnl*70/100);
		
		System.out.println( "sonuç : " + sonuc);
		

	}
	}

