package contorovescia;

public class ContoRovescia {

	
	public static void main(String[] args) {
	    contoAllaRovescia(5);
	  }

	  public static void contoAllaRovescia(int num) {
	  	if (num <=0) {
	  		System.out.println();
	  	}
	    else {
	      System.out.print(num);// Stampa 5 4 3 2 1
	      contoAllaRovescia(num-1);
	      //System.out.print(num);// Stampa 1 2 3 4 5
	    }
	  }  

}
