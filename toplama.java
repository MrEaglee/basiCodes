package java2;

import java.util.Scanner;

public class toplama {

	public static void main(String[] args) {
		
		
		
		
		Scanner reader = new Scanner(System.in);
		
		long a = reader.nextLong();
		long b = reader.nextLong();
		long c = reader.nextLong();
		long d = reader.nextLong();
		long e = reader.nextLong();
		
		long toplam = 0;
		toplam = a+b+c+d+e;
        System.out.println(toplam);
		
	}

}
