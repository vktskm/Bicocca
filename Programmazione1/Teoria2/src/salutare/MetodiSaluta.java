package salutare;

public class MetodiSaluta {
	
	public static void saluta() {
	    System.out.println("Ciao! da dentro il metodo nella stessa classe");
	  }

	  public static void main(String[] args) {
	    System.out.println("Prima del metodo");
	    saluta();
	    Saluta.salutaFuori();
	    Saluta.ciaone();
	    System.out.println("Dopo del metodo");    
	  }


}
