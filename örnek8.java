import java.util.Scanner;

public class örnek8 {

	public static void main(String[] args) {
		
		
		while(true) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayý Giriniz : ");
		int y = input.nextInt();				
		int x = 1 ;
		
		for( int i=1 ; i<=y ; i++ ) {
			
			x= x*i;
									
		}
				
		System.out.println(x);

		
		
		
		
		
		}
		
		
		}
	}


