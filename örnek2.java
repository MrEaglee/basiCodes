import java.util.Scanner;

public class örnek2 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Vize Notunu Giriniz : ");
		int vize = reader.nextInt();
		System.out.println("Final Notunu Giriniz : ");
		int fnl = reader.nextInt();
		
		int sonuc = (vize*40/100) + (fnl*60/100);
		
		if(sonuc>50) {
			System.out.println("Geçtiniz");
		}else {
			System.out.println("Geçemediniz");
		}
		
		
		

	}

}
