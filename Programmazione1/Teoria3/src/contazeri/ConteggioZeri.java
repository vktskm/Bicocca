package contazeri;

import java.util.Scanner;

public class ConteggioZeri {
	public static int contaZeri(int n) {
	    int risultato;
	    if (n==0)
	    {
	      risultato=1;
	      System.out.println("Sono nell'istruzione n==0 ");
	    }
	    else if (n<10) // <10 ma non è 0
	      {
	    	risultato=0;
	    	System.out.println("Sono nell'istruzione n<10 ");	      
	      }
	    else if (n%10==0) {
	      risultato=contaZeri(n/10)+1;
	      System.out.println("Sono nell'istruzione n%10 == 0 ");
	      }
	    else 
	    {
	      risultato=contaZeri(n/10);
	      System.out.println("Sono nell'istruzione n/10 ");
	    }
	    
	    return risultato;
	  }

	  public static void main(String[] args) {
	    int numero=0;
	    int zeri=0;
	    Scanner tastiera = new Scanner(System.in);
	    System.out.print("Inserisci un numero: ");
	    numero = tastiera.nextInt();
	    zeri = contaZeri(numero);
	    System.out.println("Contiene "+zeri+" zeri");
	  }

}
