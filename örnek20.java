import java.util.Scanner;

public class �rnek20 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Say� Giriniz : ");
		int sayi = reader.nextInt();
		
		if(sayi%3==0 && sayi%5==0) {
			System.out.println("Tam B�l�n�yor");
		}
		else
			System.out.println("Tam B�l�nm�yor");
		

	}

}
