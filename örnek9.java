import java.util.Scanner;

public class örnek9 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Fahrenayt Derecesi Giriniz : ");
		
		double drc;
		
		double fhr = reader.nextDouble();
		
		drc = (fhr-32)/(1.8);
		
		System.out.println(drc);

	}

}
