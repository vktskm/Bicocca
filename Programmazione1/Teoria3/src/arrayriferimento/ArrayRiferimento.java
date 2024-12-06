package arrayriferimento;

import java.util.Scanner;

public class ArrayRiferimento {
	
	//Il tipo base int[] non viene castato a double congli array
	public static void sottoOsopra( int [] voti , double media) {
		
		for(int i=0; i<voti.length; i++) { 
			System.out.println("Il voto "+(i+1)+ " vale " + voti[i] );
			if(voti[i] > media) 
			  System.out.println("Sopra la media ");	
			else if(voti[i] == media) 
				    System.out.println("Uguale alla media ");
			     else
			        System.out.println("Sotto la media ");	
			  
		}
		
	}
	
	
	public static void main(String[] args) {

	    
	    System.out.println("Esami superati tre già inizialiazzati ");
	    int numeroEsami=3;
	    int[] votoEsame = { 21 , 24 , 27};
        double somma=0.0;
	    
	    for(int i=0; i<numeroEsami; i++) {
	      somma += votoEsame[i];
	    }
        
	    double media = (double)somma/ numeroEsami;
	    System.out.println("La media vale " + media);
	    sottoOsopra(votoEsame , media);
	   
	 

	    System.out.println("Stampa l'indirizzo dell'array  " + votoEsame);	   

	  }

}
