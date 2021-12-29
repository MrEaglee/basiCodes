import java.util.Scanner;

public class örnek26 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Maaþ : ");
		double maas = reader.nextDouble();
		System.out.println("Çocuk : ");
        int cocuk = reader.nextInt();
        
        double toplam;
        
        if(cocuk==1) {
        	toplam = ((maas*5)/(100)) + maas;
        	System.out.println(toplam);
        	
        }else if(cocuk==2){
        	
        	toplam = ((maas*10)/(100)) + maas;
        	System.out.println(toplam);
        	
        }else if(cocuk>3){
        	toplam = ((maas*15)/100) + maas;
        	System.out.println(toplam);
        	
        }else {
        	System.out.println("Geçerli Bir Deðer Giriniz...");
        }
        
        
	}

}
