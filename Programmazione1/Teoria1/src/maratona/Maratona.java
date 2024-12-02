package maratona;

import java.util.Scanner;

/*

Calcolare il ritmo in minuti/Km per percorrere una maratona 
(42.2km) nel tempo specificato dall'utente.

IDEA DI ALGORITMO
1) Chiedere all'utente il tempo: ore, minuti, secondi
2) Calcolare il ritmo:
  2a) trasformare il tempo (ore, minuti, secondi) in secondi
  2b) calcolare il ritmo in secondi/km
  2c) trasformare il ritmo secondi/km in minuti/km
  3) Stampare il risultato
*/


public class Maratona {
	
	public static final double DISTANZA = 42.2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int secondi;
        int minuti; 
        int ore;
        
        System.out.println(" Questo programma calcola il ritmo in Km di una maratona");
        System.out.println(" Inserisci ore , minuti e secondi in una riga separati da uno spazio ");
        
        Scanner tastiera = new Scanner(System.in);
        ore = tastiera.nextInt();
        minuti = tastiera.nextInt();
        secondi = tastiera.nextInt();
        
        int totSec = 0;
        totSec = ore*3600 + minuti*60 + secondi;
        
        System.out.println("Il numero totale di secondi e' " + totSec);
        
        double ritmoSec =0;
        ritmoSec = totSec / DISTANZA;
        
        /* 
           Uso di Math.floor:
           Arrotonda per difetto al valore intero più vicino (verso il basso).
           Esempio: Math.floor(12345.6789) = 12345.
        */
        
        ritmoSec = Math.floor(ritmoSec);
        
        
        System.out.println("Il ritmo in secondi al km e' " + ritmoSec);
        
        int ritmoMin = 0;
        ritmoMin = (int)ritmoSec / 60;
        ritmoSec = ritmoSec % 60 ;
        
        
        System.out.println("Il ritmo in minuti e secondi al km e' " + 
                   ritmoMin + ":" + ritmoSec);      
        
	}

}



