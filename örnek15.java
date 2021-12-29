import java.util.Scanner;

public class örnek15 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Klavyeden Bir Sayý Giriniz : ");
        double sayý = reader.nextDouble();
        
        if(sayý>0) {
        	System.out.println("Pozitiftir.");
        }else {
        	System.out.println("Negatiftir.");
        }

	}

}
