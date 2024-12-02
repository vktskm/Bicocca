package confrontostringhe;

import java.util.Scanner;

public class ConfrontoStringhe {
	
	public static void main(String[] args){
	    String s1="ciao";
	    String s2;
	    String s3="ciao";

	    Scanner tastiera = new Scanner(System.in);
	    s2=tastiera.nextLine();

	    // Sconsigliato anche se il compilatore indica che s1 e s2  non sono uguali, 
	    // perché fa puntare s2  ad un indirizzo di memoria diverso , anche se le 
	    // stringhe s1 e s2 sono uguali.
	    if (s1==s2)
	    	System.out.println("Sono uguali");
	    else
	    	System.out.println("Non sono uguali");

	    // Sconsigliato, anche se il compilatore indica che s1 e s3 sono uguali,perchè 
	    // ottimizza s1 e s3 puntando allo stesso indirizzo di memoria questo è il motivo.
	    if (s1==s3)
	    	System.out.println("Sono uguali");
	    else
	    	System.out.println("Non sono uguali");

	    //Consigliato
	    if (s1.equals(s3))
	    	System.out.println("Sono uguali");
	    else
	    	System.out.println("Non sono uguali");

	  }

}
