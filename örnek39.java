import java.util.Scanner;

public class �rnek39 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();

		if (Math.abs(b - c) < a && a < (b + c)) {

			System.out.println("��gen �art�n� Sa�lar.");

			if(a==b && a==c && b==c ) {
				
				System.out.println("E�kenar ��gendir.");
				
			}else if(a==b || a==c || b== c) {
				
				System.out.println("ikiz Kenar ��gendir.");
			}
			else {
				System.out.println("�e�itkenar ��gendir.");
			}
			
			
			
		}else {
			
			System.out.println("��gen �art�n� Sa�lamaz.");
			
	
		}
		

	}

}
