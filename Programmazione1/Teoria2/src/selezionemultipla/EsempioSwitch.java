package selezionemultipla;

import java.util.Scanner;

public class EsempioSwitch {
	
	public static void main(String[] args) {
	    int numeroNeonati;
	    System.out.print("Inserisci il numero di neonati: ");
	    Scanner tastiera = new Scanner(System.in);
	    numeroNeonati = tastiera.nextInt();
	    
	    switch (numeroNeonati) {
	      case 1:
	        System.out.println("Congratulazioni.");
	        break;
	      case 2:
	        System.out.println("Wow. Gemelli.");
	        break;
	      case 3:
	        System.out.println("Wow. Tre.");
	        break;
	      case 4:
	      case 5:
	        System.out.print("Incredibile: ");
	        System.out.println(numeroNeonati + " bambini!");
	        break;
	      default:
	        System.out.println("Non ci credo!!!");
	        break;
	    }
	    // provare a vedere cosa succede eliminando i break
	    
	 // Richiesta del carattere da tastiera
        System.out.print("Inserisci un carattere (a, b, c, d, e): ");
        char input = tastiera.next().charAt(0);

        // Istruzione switch
        switch (input) {
            case 'a':
                System.out.println("Hai inserito la lettera a.");
                break;
            case 'b':
                System.out.println("Hai inserito la lettera b.");
                break;
            case 'c':
                System.out.println("Hai inserito la lettera c.");
                break;
            case 'd':
                System.out.println("Hai inserito la lettera d.");
                break;
            case 'e':
                System.out.println("Hai inserito la lettera e.");
                break;
            
            default:
                System.out.println("Carattere non riconosciuto.");
                break;
        }
        
        String s1 = tastiera.nextLine(); // serve per non considerare \n del char precedente
        
     // Richiesta dell'input da tastiera
        System.out.print("Inserisci una parola (juve, milan, inter): ");
        s1 = tastiera.nextLine();

        // Istruzione switch per valutare stringhe
        switch (s1.toLowerCase()) { // Convertiamo l'input in minuscolo per evitare problemi di maiuscole/minuscole
           
            case "juve":
                System.out.println("Sei un tifoso della Juventus!");
                break;
            case "milan":
                System.out.println("Sei un tifoso del Milan!");
                break;
            case "inter":
                System.out.println("Sei un tifoso dell'Inter!");
                break;
            default:
                System.out.println("Parola non riconosciuta.");
                break;
        }        
        
	  }


}
