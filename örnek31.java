import java.util.Scanner;

public class �rnek31 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Say� Giriniz : ");
		int sayi = reader.nextInt();
		int toplamtek=0;
		int tek�arp�m=1;
		

		for (int i = 1; i <= sayi; i++) {

			if (i % 2 == 0) {

				
				

			} else {
                toplamtek = toplamtek + i;
                tek�arp�m *= i;

			}			
			

		}
		
		System.out.println("�ift Toplam : "  );
		System.out.println("Tek Toplam : " + toplamtek);
		
		
	}

}
