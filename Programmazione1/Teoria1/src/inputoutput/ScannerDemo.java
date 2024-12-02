package inputoutput;

import java.util.Scanner;

public class ScannerDemo{
    
  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);

 
    int i1, i2, i3;
    System.out.println("Inserisci 3 interi separati da spazi:");
    i1 = tastiera.nextInt();
    i2 = tastiera.nextInt();
    i3 = tastiera.nextInt();
    System.out.println("Primo numero:"+i1+";");
    System.out.println("Secondo numero:"+i2+";");
    System.out.println("Terzo numero:"+i3+";");
    //1 2 3
    //1  2  3
    //  1 2  3
    //Output in tutti e 3 i casi:
    //Primo numero:1;
    //Secondo numero:2;
    //Terzo numero:3;
    
    System.out.println("Ora digita altri due numeri.");
	System.out.println("E' ammesso anche il separatore decimale.");
	double d1, d2;
	d1 = tastiera.nextDouble();
	d2 = tastiera.nextDouble();
	System.out.println("Hai digitato " + d1 + " e " + d2);
	  
    
	System.out.println("Ora digita due parole:");
	String s1, s2;
	s1 = tastiera.next();
	s2 = tastiera.next();
	System.out.println("Hai digitato \"" + s1 + "\" e \"" + s2 + "\"");
    // fare esempio con spazio in coda a parola
	  
	s1 = tastiera.nextLine();   // Necessario per gestire il '\n'
	  
	System.out.println("Digita ora una riga di testo:");
	s1 = tastiera.nextLine();
	System.out.println("Hai digitato: \"" + s1 + "\"");
    // fare esempio con spazio in coda a frase

    int n;
    //String s1, s2;
    System.out.println("vai con i 44 gatti");
    n = tastiera.nextInt();
    s1 = tastiera.nextLine();
    s2 = tastiera.nextLine();
    System.out.println("contenuto n:\"" + n +"\"");
    System.out.println("contenuto s1:\"" + s1 +"\"");
    System.out.println("contenuto s2:\"" + s2 +"\"");
    
    
    /* Primo caso  input giusto per il codice scritto
       44 gatti in
       fila per 3
       ---e poi--- 
       Secondo caso input sbagliato per il codice scritto
       44
       gatti in
       fila per 3
    */
    
    
    // come faccio a leggere un singolo carattere??
    System.out.print("inserisci un singolo carattere:  ");
    char c;
    c = tastiera.next().charAt(0);
    System.out.println("hai inserito "+c);
    // manipolazione char
    //c = c+1; // errore rilevato dal compilatore!
    // viene convertito a int per sommare 1 ma poi da errore 
    // quando deve assegnare il valore a un char
    System.out.println("è diventato "+c);
    c = (char)(c+1); // OK
    System.out.println("è diventato "+c);
    c++; // OK
    System.out.println("è diventato "+c);
    n=c;
    System.out.println("codice ascii (e unicode) "+n);
  }
}
