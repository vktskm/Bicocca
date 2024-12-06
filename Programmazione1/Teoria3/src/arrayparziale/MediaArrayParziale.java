package arrayparziale;

import java.util.Scanner;

public class MediaArrayParziale {
	
	public static void main(String[] args) {

	    Scanner tastiera = new Scanner(System.in);
	    System.out.println("Quanti esami hai superato?");
	    int numeroEsami = tastiera.nextInt();
	    int[] votoEsame = new int[20];

	    int livelloRiempimento=0;
	    for(int i=0; i<numeroEsami; i++) {
	      System.out.println("Inserisci il voto del "+(i+1)+"° esame: ");
	      votoEsame[i]=tastiera.nextInt();
	      livelloRiempimento++;
	    }

	   
	    int somma=0;
	    for(int i=0; i<livelloRiempimento; i++)
	      somma+=votoEsame[i];
	    
	    double media=(double)somma/livelloRiempimento;
	    System.out.println("La tua media con indice livelloRiempimento e': "+media);

	    somma=0;
	    for(int i=0; i<votoEsame.length; i++)
	      somma+=votoEsame[i];
	    
	    media=(double)somma/votoEsame.length;
	    System.out.println("La tua media con indice votoEsame.length e': "+media);

	    

	  }


}
