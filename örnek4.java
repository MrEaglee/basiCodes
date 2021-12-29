import java.util.Scanner;

public class örnek4 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Programcý Ýsmi : ");
		
		String isim = reader.nextLine();
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.println(isim);
		}

	}

}
