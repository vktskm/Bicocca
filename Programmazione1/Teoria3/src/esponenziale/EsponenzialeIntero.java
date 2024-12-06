package esponenziale;

import java.util.Scanner;

public class EsponenzialeIntero {
	
	 public static int elevamento(int b, int e) {
		    
		 /*   if (e==0)
		      return(1);
		    else
		      return(b*elevamento(b,e-1));
		 */ 
		    int risultato;
		    if (e==0) {
		      risultato=1;
		      System.out.println("risultato parziale " + risultato);
		      }
		    else {  
		      risultato=b*elevamento(b,e-1);
		      System.out.println("risultato parziale " + risultato);
		    }
		      
		    return risultato;
		    
		  }

		  public static void main(String[] args) {
		    int base=0, espo=0, risultato=0;
		    Scanner tastiera = new Scanner(System.in);
		    System.out.println("Inserisci base ed esponente: ");
		    base = tastiera.nextInt();
		    espo = tastiera.nextInt();
		    risultato = elevamento(base,espo);
		    System.out.println("risultato: "+risultato);
		  }


}
