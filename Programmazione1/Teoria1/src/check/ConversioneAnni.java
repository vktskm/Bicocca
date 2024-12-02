package check;

import java.util.Scanner;

public class ConversioneAnni {
	
	public static void main(String[] args) {
	    Scanner tastiera = new Scanner(System.in);
	    System.out.println("Inserire l'età in anni (interi)");
	    System.out.println("Sono permessi valori compresi tra 0 e 110 (esclusi)");
	    int anni=tastiera.nextInt();
	    
	    if (anni>0 && anni<110){

	      int mesi=12*anni;
	      int giorni=365*anni;
	      int ore=24*giorni;
	      int minuti=ore*60;

	      System.out.println("Hai "+mesi+" mesi");
	      System.out.println("Hai "+giorni+" giorni");
	      System.out.println("Hai "+ore+" ore");
	      System.out.println("Hai "+minuti+" minuti");
	    }
	    else 
	      System.out.println("Il valore di età inserito non soddisfa le condizioni");
	  }


}
