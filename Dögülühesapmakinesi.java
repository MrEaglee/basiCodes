package java2;

import java.util.Scanner;

public class D�g�l�hesapmakinesi {

	public static void main(String[] args) {
		int i = 0;
		do {
			Scanner input = new Scanner(System.in);
			System.out.print("L�tfen �lk Say�y� Giriniz : ");
			int Say�1 = input.nextInt();
			System.out.print("L�tfen �kinci Say�y� Giriniz : ");
			int Say�2 = input.nextInt();
			System.out.print("L�tfen Yapacap�n�z ��lemi Se�iniz (etc.+ - * / ) : ");
			char karakter = input.next().charAt(0);
			int sonu�;
			switch (karakter) {
			case '+':
				sonu� = (Say�1) + (Say�2);
				System.out.println(sonu�);
				break;
			case '-':
				sonu� = (Say�1) - (Say�2);
				System.out.println(sonu�);
				break;
			case '*':
				sonu� = (Say�1) * (Say�2);
				System.out.println(sonu�);
				break;
			case '/':
				sonu� = (Say�1) / (Say�2);
				System.out.println(sonu�);
				break;

			default:
				System.out.println("L�tfen Ge�erli Bir Karakter Giriniz... ");
				break;
			}

		} while (i == 0);
		i++;
	}

}
