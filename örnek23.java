import java.util.Scanner;

public class �rnek23 {

	public static void main(String[] args) {
	
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("S�cakl�k : ");
		int s�c = reader.nextInt();
		
		
		if(s�c<0) {
			System.out.println("Kat�");
		}
		else if(s�c>0 && s�c<100 ) {
			System.out.println("S�v�");
		}
		else
			System.out.println("Gaz");
		
		
		
	}

}
