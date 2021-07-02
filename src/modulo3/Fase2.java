package modulo3;

//FabianaArzamendia
import java.util.Arrays;

public class Fase2 {
	
	public static void main(String[] args) {
	
	String [] arrayCiudad = {"Berlin" , "Madrid"  ,"Lisboa" , "Barcelona" , "Roma" , "Napoles"};
	
	System.out.println("Ciutats per ordre alfabétic: ");
	for(int i = 0 ; i < arrayCiudad.length ; i++) {
		Arrays.sort(arrayCiudad);
		System.out.println(arrayCiudad[i]);
				
	}
	
	
  }	

}
