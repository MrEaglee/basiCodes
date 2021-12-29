package java1;

import java.util.Scanner;

public class fibonaccihesabý {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		int n = k.nextInt();
		
		
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(b);

		do {
			c = a + b;
			if (c > n)
				break;
			System.out.print("-" + c);
			a = b;
			b = c;

		} while (c < n);

	}

}
