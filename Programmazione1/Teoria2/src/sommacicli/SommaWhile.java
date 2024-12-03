package sommacicli;

import java.util.Scanner;

public class SommaWhile {
	
	 public static void main(String[] args) {
		 
		    Scanner tastiera = new Scanner(System.in);
		    System.out.println("Il programma effettua la somma di numeri positivi");
		    System.out.println("Inserire un numero negativo per terminare\n");
		    System.out.println("Ciclo do-while");
		    double numero;
		    double somma=0;
		 
		    do {
		      System.out.println("Inserisci il numero successivo:");
		      numero=tastiera.nextDouble();
		      if (numero>=0){
		        somma+=numero;
		      }
		    }
		    while (numero>=0);
		    
		    System.out.println("La somma è: "+somma);
            
		    // come facciamo a convertire il ciclo do-while precedente in un ciclo while?
		    somma=0;
		    numero=0; // per assicurarmi che almeno una volta venga eseguito il corpo
		    System.out.println("Ciclo while");
		    
		    while (numero>=0) {
		        somma+=numero;
		        System.out.println("Inserisci il numero successivo:");
		        numero=tastiera.nextDouble();
		    }
		    
		    System.out.println("La somma è: "+somma);

		  }


}
