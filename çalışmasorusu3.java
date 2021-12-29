package java2;

public class çalýþmasorusu3 {

	public static void main(String[] args) {

	double pay =1.0;
	double fak= 1.0;
	double t=1;
	
	     for(double n=1 ;n<=4 ; n++) {
	    	 
	    	 for(double üs=1 ; üs<=n+1 ; üs++) {
	    		 
	    		 pay= pay*n;
	    		 
	    	 }
	    	 for(double k=1 ; k<=(n+2) ; k++ ) {
	    		 fak *= k;
	    	 }
	    	 
	    	 t += pay/fak;
	    	 pay=1.0;
	    	 fak=1.0;
	     }
		
	     System.out.println(t);
		
		
		
		
		
		

	}

}
