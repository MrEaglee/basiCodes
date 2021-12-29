package java1;

import java.util.Scanner;

public class Klavyedengirilensayýnýntekmiçiftmiolduðu {

	public static void main(String[] args) {
		
		int a = 0;
		do {		
		    Scanner input = new Scanner(System.in);
			System.out.print("Lütfen Bir Sayý Giriniz : ");
			int Sayý = input.nextInt();
			
			if(Sayý%2==0) {
			System.out.println("Çift");
			
			}
			else {
				System.out.println("Tek");
			}
				
		}
		
		while(a==0);
		
		
		

	}

}
