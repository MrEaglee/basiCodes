import java.util.Scanner;

public class örnek39 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();

		if (Math.abs(b - c) < a && a < (b + c)) {

			System.out.println("Üçgen Þartýný Saðlar.");

			if(a==b && a==c && b==c ) {
				
				System.out.println("Eþkenar Üçgendir.");
				
			}else if(a==b || a==c || b== c) {
				
				System.out.println("ikiz Kenar Üçgendir.");
			}
			else {
				System.out.println("Çeþitkenar Üçgendir.");
			}
			
			
			
		}else {
			
			System.out.println("Üçgen Þartýný Saðlamaz.");
			
	
		}
		

	}

}
