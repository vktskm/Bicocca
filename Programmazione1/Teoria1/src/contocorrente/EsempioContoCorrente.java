package contocorrente;

import java.util.Scanner;

public class EsempioContoCorrente {
	
	public static void main(String[] args){
	  	Scanner tastiera = new Scanner(System.in);
	  	double saldo=0;
	  	double interesse=0.1;
	  	double penalita=50.0;
	  	System.out.println("Inserisci il saldo del conto");
	  	saldo = tastiera.nextDouble();

	  	// singola istruzione
	  	
	  	if (saldo>0)
	  		saldo = saldo + (interesse*saldo);
	  	else
	  		saldo = saldo - penalita;
	  	
	  	System.out.println("Il nuovo saldo è "+saldo);
	  	

	  	// istruzione composta/complessa o blocco di istruzioni
	  	
	  	if (saldo>0) {
	  		saldo = saldo + (interesse*saldo);
	  		System.out.println("Complimenti il saldo è aumentato");
	  	}
	  	else {
	  		   saldo = saldo - penalita;
	  	       System.out.println("Complimenti il saldo è diminuito");
	  	     }
	  	System.out.println("Il nuovo saldo è "+saldo);
		


	  }


}
