import java.util.Scanner;

public class �rnek11 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Al�� Fiyat�n� Giriniz : ");
		double al�s = reader.nextDouble();
		System.out.println("Vergi Oran�n� Giriniz : ");
		double vergi = reader.nextDouble();
		System.out.println("Kar Oran�n� Girinizi : ");
        double kar = reader.nextDouble();
        double sat�s;
        sat�s = (kar) + (al�s*vergi)/(100)+ (al�s);
        
        System.out.println(sat�s);
        
        
        
        
	}

}
