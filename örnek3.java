import java.util.Scanner;

public class �rnek3 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Bir Tamsay� Giriniz : ");
		int say� = reader.nextInt();
		
		if(say�==0) {
			System.out.println("Say� S�f�rd�r.");
		}else if(say�>0) {
			System.out.println("Say� Pozitiftir.");
		}else {
			System.out.println("Say� Negatiftir.");
		}
			
		

	}

}
