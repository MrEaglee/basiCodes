import java.util.Scanner;

public class �rnek14 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Ak�m Giriniz : ");
		double ak�m = reader.nextDouble();
		System.out.println("Dire� Giriniz : ");
		double direnc= reader.nextDouble();
		
		double gerilim = ak�m*direnc;
		System.out.println(gerilim);

	}

}
