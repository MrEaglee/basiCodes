import java.util.Scanner;

public class �rnek26 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Maa� : ");
		double maas = reader.nextDouble();
		System.out.println("�ocuk : ");
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
        	System.out.println("Ge�erli Bir De�er Giriniz...");
        }
        
        
	}

}
