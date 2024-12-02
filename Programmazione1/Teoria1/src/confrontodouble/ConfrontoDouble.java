package confrontodouble;

public class ConfrontoDouble {
  
	public static void main(String[] args) {
	    // lo calcolo in un modo
	    double f1 = 0.0;
	    f1 += .1;
	    f1 += .1;
	    f1 += .1;
	    f1 += .1;
	    f1 += .1;
	    f1 += .1;
	    f1 += .1;
	    f1 += .1;
	    f1 += .1;
	    f1 += .1;
	    f1 += .1;
	 
	    // lo calcolo in un altro
	    double f2 = 0.1 * 11;
	 
	    System.out.println("f1  vale  = " + f1);
	    System.out.println("f2  vale  = " + f2);
	 
	    // confronto sconsigliato
	    if (f1 == f2)
	        System.out.println("f1 e f2 sono uguali");
	    else
	        System.out.println("f1 e f2 non sono uguali");

	    // confronto consigliato
	    if (Math.abs(f1-f2)<1e-10)
	        System.out.println("f1 e f2 sono uguali");
	    else
	        System.out.println("f1 e f2 non sono uguali");
	  }

}
