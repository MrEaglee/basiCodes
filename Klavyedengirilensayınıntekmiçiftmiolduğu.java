package java1;

import java.util.Scanner;

public class Klavyedengirilensay�n�ntekmi�iftmioldu�u {

	public static void main(String[] args) {
		
		int a = 0;
		do {		
		    Scanner input = new Scanner(System.in);
			System.out.print("L�tfen Bir Say� Giriniz : ");
			int Say� = input.nextInt();
			
			if(Say�%2==0) {
			System.out.println("�ift");
			
			}
			else {
				System.out.println("Tek");
			}
				
		}
		
		while(a==0);
		
		
		

	}

}
