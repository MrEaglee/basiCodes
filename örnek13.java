import java.util.Scanner;

public class örnek13 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Yükseklik Giriniz : ");
		double yük = reader.nextDouble();
		System.out.println("Taban Giriniz : ");
		double tab = reader.nextDouble();
		
		double alan = (tab*yük)/2;
		System.out.println("Alan : " + alan);
		
		

	}

}
