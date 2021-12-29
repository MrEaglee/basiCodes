package java2;

public class çalýþmasorusu1 {

	public static void main(String[] args) {
		
		double kýsak, uzunk, dikdörtgen , integral = 0.0;
		
		    for(double x=0.0 ; x<=3.79083455 ; x=x+0.001) {
		    	kýsak=0.001;
		    	
		    	uzunk=5+ 2.0*Math.sin(x);
		    	
		    	dikdörtgen=kýsak*uzunk;
		    	
 	    	integral +=dikdörtgen;
		    	
		    	
		    }
		
		System.out.println(integral);
		
		
		//(5+2*Math.sin(x)-x=0)
		

	}

}
