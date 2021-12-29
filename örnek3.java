import java.util.Scanner;

public class örnek3 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Bir Tamsayý Giriniz : ");
		int sayý = reader.nextInt();
		
		if(sayý==0) {
			System.out.println("Sayý Sýfýrdýr.");
		}else if(sayý>0) {
			System.out.println("Sayý Pozitiftir.");
		}else {
			System.out.println("Sayý Negatiftir.");
		}
			
		

	}

}
