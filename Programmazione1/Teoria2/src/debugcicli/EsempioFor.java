package debugcicli;

import java.util.Scanner;

public class EsempioFor {
	
	public static void main(String[] args) {
	    Scanner tastiera = new Scanner(System.in);
	    int prodotto=1;
	    int i;
	    boolean modalitaDebug=true;

	    for (i=1; i<=10; i++) {
	      prodotto = prodotto*i;
	      if (modalitaDebug) {
	        System.out.println("prodotto: "+prodotto);
	        System.out.println("i: "+i);
	      }
	    }
	    System.out.println("risultato: "+prodotto);



	    System.out.println("Stampa dei numeri da 0 a 29");
	    // doppio update
	    //for (int num=0; num<=29; System.out.println(num), num++);
	    //for (int num=0; num<=29; num++, System.out.println(num) );
	    //for (int num=0; num<=29; System.out.println(num++) );


	    // ciclo annidato
	    for (int decine=0; decine<=2; decine++) 
	      for (int unita=0; unita<=9; unita++) {
	        // stampa come intero
	    	System.out.print( " " );
	        System.out.print(decine*10+unita);

	        // strana come stringa
	        //System.out.println(""+decine+unita);
	      }


	    System.out.println("\nInserisci una stringa:");
	    String stringa = tastiera.next();
	    System.out.println("Hai inserito "+stringa);
	    
	    System.out.println("Carattere diviso in ordine");
	    // stampa di un carattere per volta
	    for (int index=0; index<stringa.length(); index++)
	      System.out.print("  " + stringa.charAt(index));
        
	    System.out.println("\nCarattere diviso al contrario");
	    // stampa al contrario
	    for (int index=stringa.length()-1; index>=0; index--)
	      System.out.print("  " + stringa.charAt(index));

	  }

}
