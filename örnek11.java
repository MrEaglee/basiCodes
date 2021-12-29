import java.util.Scanner;

public class örnek11 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Alýþ Fiyatýný Giriniz : ");
		double alýs = reader.nextDouble();
		System.out.println("Vergi Oranýný Giriniz : ");
		double vergi = reader.nextDouble();
		System.out.println("Kar Oranýný Girinizi : ");
        double kar = reader.nextDouble();
        double satýs;
        satýs = (kar) + (alýs*vergi)/(100)+ (alýs);
        
        System.out.println(satýs);
        
        
        
        
	}

}
