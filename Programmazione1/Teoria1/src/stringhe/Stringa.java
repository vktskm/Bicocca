package stringhe;

public class Stringa {

	public static void main(String[] args) {
	   
		String parola="PIPPO";
        String nome="Ciao che bella giornata";
        int n=0;

        // estrazione della sottostringa dalla posizione 2 alla 4 (esclusa)
        String sottostringa = nome.substring(2,4);
        System.out.println(sottostringa);

        // estrazione della sottostringa dalla posizione 2 alla fine della stringa
        sottostringa = nome.substring(2);
        System.out.println(sottostringa);

        // conversione di tutta la stringa in maiuscole
        nome=nome.toUpperCase();
        System.out.println(nome);

        // conversione di tutta la stringa in minuscole e lunghezza della stringa
        nome=nome.toLowerCase();
        int lunghezza=nome.length();
        System.out.println("La lunghezza di \"" +nome+ "\" è "+lunghezza);

        // confronto tra stringhe (case-sensitive)
        nome="pippo";
        parola="PIPPO";
        System.out.println("Le stringhe sono uguali? " + nome.equals(parola));
        // confronto tra stringhe (ignorando maiuscole e minuscole)
        System.out.println("Le stringhe sono uguali? " + nome.equalsIgnoreCase(parola));

        // estrazione del carattere all'interno della stringa in una determinata posizione
        char c = nome.charAt(1);
        System.out.println(c);

        // indice della prima occorrenza di "pp" all'interno della stringa 
        //(se la trova, n è >=0)
        n=nome.indexOf("pp");
        System.out.println(n);

        // cosa succede quando non viene trovata? (n è -1)
        n=nome.indexOf("wow!");
        System.out.println(n);

        // indice della prima occorrenza di "na" in "banana"
        nome="banana";
        n=nome.indexOf("na");
        System.out.println(n);
        // indice dell'ultima occorrenza di "na" in "banana"
        n=nome.lastIndexOf("na");
        System.out.println(n);

        // lunghezza della stringa che contiene solo uno spazio
        nome=" ";
        System.out.println(nome.length());
        // lunghezza della stringa vuota
        String vuota="";
        System.out.println(vuota.length());
        // lunghezza della stringa che contiene caratteri di escape
        nome="\"";
        System.out.println(nome.length());

        // stampa con caratteri di escape
        nome="ciao\na\ntutti";
        System.out.println(nome);
        nome="ciao\ta\ttutti";
        System.out.println(nome);
        nome="ciao\rm"; // attenzione quando eseguite! il risultato atteso è quello che si ottiene da terminale
        System.out.println(nome);
        System.out.println(nome.length());

        // cosa succede quando richiedo un carattere in un indice che non esiste?
        // errore a run time
        //System.out.println(nome.charAt(6));
    }
}

