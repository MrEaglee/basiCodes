import java.util.Scanner;

public class �rnek15 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Klavyeden Bir Say� Giriniz : ");
        double say� = reader.nextDouble();
        
        if(say�>0) {
        	System.out.println("Pozitiftir.");
        }else {
        	System.out.println("Negatiftir.");
        }

	}

}
