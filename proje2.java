package java2;

import java.util.Scanner;

public class proje2 {

	public static void main(String[] args) {

		int sayý1 = 25;
		int sayý2 = 654;

		int enBüyük = sayý1;

		if (sayý1 < sayý2) {

			enBüyük = sayý2;
		}

		else if (sayý1 > sayý2) {
			enBüyük = sayý1;
		}

		else {

			enBüyük = sayý1 = sayý2;
		}
		System.out.println(enBüyük);
		
		if(sayý1%2==0) {
			System.out.println("Sayý1 çift");
			
			
		}
		else if(sayý2%2==0) {
			
			
			
		}
		
		
		
		else {
			System.out.println("Sayý1 Tek");
			System.out.println("Sayý2 Tek");
		}
		

	}

}
