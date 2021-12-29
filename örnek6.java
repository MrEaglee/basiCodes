import java.util.Scanner;

public class örnek6 {

	public static void main(String[] args) {
		
	Scanner reader = new Scanner(System.in);
	
	System.out.print("Fiyat Giriniz : ");
	
	double fiyat = reader.nextDouble();
	
	double sonuc = fiyat + (fiyat*18/100);
	
	System.out.println(sonuc + " TL" );
	
		
		

	}

}
