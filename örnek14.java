import java.util.Scanner;

public class örnek14 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Akým Giriniz : ");
		double akým = reader.nextDouble();
		System.out.println("Direç Giriniz : ");
		double direnc= reader.nextDouble();
		
		double gerilim = akým*direnc;
		System.out.println(gerilim);

	}

}
