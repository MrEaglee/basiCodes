package java2;

public class �al��masorusu3 {

	public static void main(String[] args) {

	double pay =1.0;
	double fak= 1.0;
	double t=1;
	
	     for(double n=1 ;n<=4 ; n++) {
	    	 
	    	 for(double �s=1 ; �s<=n+1 ; �s++) {
	    		 
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
