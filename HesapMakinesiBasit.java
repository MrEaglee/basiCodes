package java2;

import java.util.Scanner;

public class HesapMakinesiBasit{

	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in) ;
			System.out.print("Lütfen Ýlk Sayýyý Giriniz : ");
			int Sayý1 = input.nextInt();
			System.out.print("Lütfen Ýkinci Sayýyý Giriniz : ");
			int Sayý2 = input.nextInt();
			System.out.print("Lütfen Yapacapýnýz Ýþlemi Seçiniz (etc.+ - * / ) : ");
			char karakter = input.next().charAt(0);
			int sonuç ; 
			switch(karakter){
				case '+' :
					sonuç = (Sayý1)+(Sayý2);
					System.out.println(sonuç);
					break;
				case '-' :
					sonuç = (Sayý1)-(Sayý2);
					System.out.println(sonuç);
					break;
				case '*' :
					sonuç = (Sayý1)*(Sayý2);
					System.out.println(sonuç);
					break;
				case '/' :
					sonuç = (Sayý1)/(Sayý2);
					System.out.println(sonuç);
					break;
					
					default :
						System.out.println("Lütfen Geçerli Bir Karakter Giriniz... ");
					break;
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		

	}



