
// A este porgrama el usuario ingresa el nombre de un pais y el 
//y el usuario regresa el nombre de su capital y si no la tiene guardada
//el usuario puede ingresar el nombre del pais y la capital.

//Feedback de Félix: buena orientacion al detalle, buena explicacion. 

package codigo7;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Poner todo dentro del metdo Main
	
		//Agregar system.in al scanner y cambie el nombre de la variable para que fuera más claro
	    Scanner scanner = new Scanner(System.in);

	    //Importar HashMap y los tipos de datos deben ser strings
	    HashMap<String,String> capitales = new HashMap<>();

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "San Salvador");//Le faltaba un dato  
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    //String mal escrito 
	    String c = "";
	    do {
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");//Debe ser System.out.print()
	      c = scanner.nextLine();//Para que se guarde el string debe ser nextLine
	      
	      if (!c.equals("salir")) {
	    	  //Era key
	        if (capitales.containsKey(c)) {
	         
	          System.out.print("La capital de " + c);
	          System.out.println(" es " + capitales.get(c));
	        } else { 
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = scanner.nextLine();
	         //era capitales en lugar de ca
	          capitales.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    }  while(!c.equals("salir"));
	  
	    //Hay que cerrar el scanner
	    scanner.close();
	  }
		
}	
	
		
	


