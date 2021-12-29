import java.util.Scanner;

public class örnek31 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Sayý Giriniz : ");
		int sayi = reader.nextInt();
		int toplamtek=0;
		int tekçarpým=1;
		

		for (int i = 1; i <= sayi; i++) {

			if (i % 2 == 0) {

				
				

			} else {
                toplamtek = toplamtek + i;
                tekçarpým *= i;

			}			
			

		}
		
		System.out.println("Çift Toplam : "  );
		System.out.println("Tek Toplam : " + toplamtek);
		
		
	}

}
