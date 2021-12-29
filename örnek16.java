import java.util.Scanner;

public class örnek16 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int not = reader.nextInt();
		
		if(not>50) {
			System.out.println("Geçti.");
		}else
			System.out.println("Kaldý.");
		
		

	}

}
