package calcolatrice;

import java.util.Scanner;

public class CalcolatriceIntera {

	
	      public static int somma(int i1, int i2) {
		    return i1+i2;
		  }

		  public static int sottrai(int i1, int i2) {
		    return i1-i2;
		  }

		  public static int dividi(int i1, int i2) {
		    
		    if (i2==0){
		      System.out.println("Divisione per zero! non è consentita");
		      return 0;
		    }
		    
		    return i1/i2;
		    
		  }

		  public static int moltiplica(int i1, int i2) {
		    return i1*i2;
		  }
		  
		  public static int effettuaOperazione(String op, int op1, int op2) {
			    int risultato=0;
			    //int risultato deve essere inizializzato perchè lo switch può 
			    //andare nel caso di default ed non assegnare un valore ad risultato
			    switch (op) {
			      case "somma":
			        risultato=somma(op1,op2);
			        break;
			      case "sottrai":
			        risultato=sottrai(op1,op2);
			        break;
			      case "dividi":
			        risultato=dividi(op1,op2);
			        break;
			      case "moltiplica":
			        risultato=moltiplica(op1,op2);
			        break;
			      default:
			        System.out.println("operatore non riconosciuto");
			        System.exit(0);//Termina il programma se l'operazione non è consentita
			    }
			    return risultato;
			  }
		  

		  public static void main(String[] args) {
		    DriverC.driverMoltiplica();
		    DriverC.driverDividi();
		    System.out.println("inserisci operatore e operandi");
		    Scanner tastiera = new Scanner(System.in);
		    String operatore = tastiera.next();
		    int op1 = tastiera.nextInt();
		    int op2 = tastiera.nextInt();
		    System.out.println("Risultato: "+effettuaOperazione(operatore, op1, op2));
		  }

		  

}
