import java.util.Scanner;

public class örnek23 {

	public static void main(String[] args) {
	
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Sýcaklýk : ");
		int sýc = reader.nextInt();
		
		
		if(sýc<0) {
			System.out.println("Katý");
		}
		else if(sýc>0 && sýc<100 ) {
			System.out.println("Sývý");
		}
		else
			System.out.println("Gaz");
		
		
		
	}

}
