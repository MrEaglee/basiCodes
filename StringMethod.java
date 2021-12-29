package java2;

import java.util.Scanner;

public class StringMethod{

	public static void main(String[] args) {

		
    Scanner reader = new Scanner(System.in);
    /*
    System.out.println("Bir cümle Giriniz : ");
    
    String cümle = reader.nextLine();
    int uzunluk = cümle.length();
    System.out.println("Cümlenin Uzunluðu : "+ uzunluk );
    
    
    System.out.println("Hangi Karakterden Aytýlsýn ?");
    String harf = reader.nextLine();
    String sonuc[] = cümle.split(harf);
    System.out.println(sonuc[0]+'\n'+ sonuc[1] + '\n'+ sonuc[2] );
    
    */
    
   // String a = "bilgisayermuhendisi";
    //System.out.println("muhendis kelimesini" );
    
    
    
    
    System.out.println("Bir Kelime Giriniz : ");
    String b = reader.nextLine();
    if(b.equalsIgnoreCase("Merhaba"));
    
    else 
       System.out.println("Farklý kelime");
    
    System.out.println("Büyük Harfle : " +b.toUpperCase() );  //b.toLowerCase()
    
    
    
    
    
    
    
    
    
		
		
		
		
		
		
		
		

	}

}
