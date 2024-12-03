package stringhecicli;

import java.util.Scanner;

public class StringheWhile {

	public static void main(String[] args) {
	      
	      Scanner tastiera = new Scanner(System.in);
	      char carattere;
	      int indice;
	    
	   
	      System.out.print("Inserisci una stringa: ");
	      String stringa = tastiera.next();
	      int lunghezzaStringa = stringa.length();
	   
	      System.out.println("La stringa contiene " + lunghezzaStringa +
	                         " caratteri.");
	                         
	      // Stampa a video i caratteri, uno per uno
	      System.out.println("Ecco i caratteri della stringa:");
	      indice = 0;
	      
	      while (indice < lunghezzaStringa) {
	        System.out.print(stringa.charAt(indice) + " ");
	        indice++;
	      }
	    
	      // Stampa i caratteri in ordine inverso, e conta quante
	      // iterazioni vengono fatte
	      System.out.println("\nEcco i caratteri in ordine inverso:");
	      indice = lunghezzaStringa-1;
	      int contatore = 0;
	      
	      while (indice >= 0) {
	          System.out.print(stringa.charAt(indice) + " ");
	          indice--;
	          contatore++;
	      } 

	      System.out.println("\nCiclo while eseguito " + contatore + " volte.");    

	    
	      // Controlla se la stringa è palindroma
	    boolean palindroma;
	    System.out.println("\nVediamo ora se la stringa e' palindroma.");
	    indice = 0;
	    palindroma = true;
	    while (palindroma && (indice < lunghezzaStringa / 2)) {
	     if (stringa.charAt(indice) != stringa.charAt(lunghezzaStringa-1-indice))
	         palindroma = false;
	     
	         indice++;
	    }
	      
	    if (palindroma)
	     System.out.println("La stringa e' palindroma.");
	    else
	     System.out.println("La stringa NON e' palindroma.");
	   
	    // Conta il numero di vocali, usando un if
	    int numeroVocali;
	    numeroVocali = 0;
	    indice = 0;
	    
	    while (indice < lunghezzaStringa) {
	     if ( stringa.charAt(indice) == 'a' || stringa.charAt(indice) == 'A' ||
	          stringa.charAt(indice) == 'e' || stringa.charAt(indice) == 'E' ||
	          stringa.charAt(indice) == 'i' || stringa.charAt(indice) == 'I' ||
	          stringa.charAt(indice) == 'o' || stringa.charAt(indice) == 'O' ||
	          stringa.charAt(indice) == 'u' || stringa.charAt(indice) == 'U')
	          numeroVocali++;
	          
	          indice++;
	    }
	    System.out.println("La stringa contiene " + numeroVocali + " vocali.");
	    
	      // Conta il numero di vocali, usando una switch
	    numeroVocali = 0;
	    indice = 0;
	    while (indice < lunghezzaStringa) {
	     switch(stringa.charAt(indice)) {
	      case 'a':
	      case 'A':
	      case 'e':
	      case 'E':
	      case 'i':
	      case 'I':
	      case 'o':
	      case 'O':
	      case 'u':
	      case 'U': 
	    	  numeroVocali++;
	     }
	         indice++;
	    }
	    
	    System.out.println("La stringa contiene " + numeroVocali + " vocali.");
	   
	}

}
