import java.util.Scanner;

public class �rnek13 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Y�kseklik Giriniz : ");
		double y�k = reader.nextDouble();
		System.out.println("Taban Giriniz : ");
		double tab = reader.nextDouble();
		
		double alan = (tab*y�k)/2;
		System.out.println("Alan : " + alan);
		
		

	}

}
