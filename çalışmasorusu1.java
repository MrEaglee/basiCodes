package java2;

public class �al��masorusu1 {

	public static void main(String[] args) {
		
		double k�sak, uzunk, dikd�rtgen , integral = 0.0;
		
		    for(double x=0.0 ; x<=3.79083455 ; x=x+0.001) {
		    	k�sak=0.001;
		    	
		    	uzunk=5+ 2.0*Math.sin(x);
		    	
		    	dikd�rtgen=k�sak*uzunk;
		    	
 	    	integral +=dikd�rtgen;
		    	
		    	
		    }
		
		System.out.println(integral);
		
		
		//(5+2*Math.sin(x)-x=0)
		

	}

}
