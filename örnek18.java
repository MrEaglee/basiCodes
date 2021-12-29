import java.util.Scanner;

public class örnek18 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int sayi = reader.nextInt();
		
		if(sayi%2==0) {
			System.out.println("ÇÝFT");
		}else
			System.out.println("TEK");

	}

}
