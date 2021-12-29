import java.util.Scanner;

public class örnek20 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Sayý Giriniz : ");
		int sayi = reader.nextInt();
		
		if(sayi%3==0 && sayi%5==0) {
			System.out.println("Tam Bölünüyor");
		}
		else
			System.out.println("Tam Bölünmüyor");
		

	}

}
