import java.util.Scanner;

public class �rnek17 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Not1 : ");
		int not1 = reader.nextInt();
		System.out.println("Not2 : ");
        int not2 = reader.nextInt();
        System.out.println("S�zl� : ");
        int s�z = reader.nextInt();
        
        int ort = (not1 + not2 + s�z)/3;
        System.out.println(ort);
        
        if(ort>=50) {
        	System.out.println("Ge�ti.");
        }else
        	System.out.println("Kald�.");
        
	}

}
