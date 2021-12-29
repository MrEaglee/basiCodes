import java.util.Scanner;

public class örnek10 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("a : ");
		int a = reader.nextInt();
		System.out.print("b : ");
		int b = reader.nextInt();
		System.out.print("c : ");
		int c = reader.nextInt();
		
		double disk = (b*b)-(4*a*c);
		
		if(disk==0) {
			
		int x1 = (-b/a);
			
		System.out.println(x1);
		}
		else if (disk>0) {
			
			double x1 =(-b+Math.sqrt(disk)/(2*a));
			double x2 =(-b-Math.sqrt(disk)/(2*a));
			System.out.print( x1 + x2);
		}
		else {
			System.out.println("Reel Kök Yoktur.");
		}
		
		

	}

}
