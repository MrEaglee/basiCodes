package java2;

import java.util.Scanner;

public class StringMethod{

	public static void main(String[] args) {

		
    Scanner reader = new Scanner(System.in);
    /*
    System.out.println("Bir c�mle Giriniz : ");
    
    String c�mle = reader.nextLine();
    int uzunluk = c�mle.length();
    System.out.println("C�mlenin Uzunlu�u : "+ uzunluk );
    
    
    System.out.println("Hangi Karakterden Ayt�ls�n ?");
    String harf = reader.nextLine();
    String sonuc[] = c�mle.split(harf);
    System.out.println(sonuc[0]+'\n'+ sonuc[1] + '\n'+ sonuc[2] );
    
    */
    
   // String a = "bilgisayermuhendisi";
    //System.out.println("muhendis kelimesini" );
    
    
    
    
    System.out.println("Bir Kelime Giriniz : ");
    String b = reader.nextLine();
    if(b.equalsIgnoreCase("Merhaba"));
    
    else 
       System.out.println("Farkl� kelime");
    
    System.out.println("B�y�k Harfle : " +b.toUpperCase() );  //b.toLowerCase()
    
    
    
    
    
    
    
    
    
		
		
		
		
		
		
		
		

	}

}
