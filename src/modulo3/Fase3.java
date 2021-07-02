package modulo3;

import java.util.Arrays;

public class Fase3 {
	
	public static void main(String[] args) {
		
		String [] arrayCiudad = {"Berlin" , "Madrid"  ,"Lisboa" , "Barcelona" , "Roma" , "Napoles"};
		String [] ArrayCiutatsModificades = new String [6];
		
		System.out.println("Ciutats modificades per ordre alfebétic: ");
		
		for(int i = 0 ; i < arrayCiudad.length ; i++) {
						
				ArrayCiutatsModificades[i]=arrayCiudad[i].replace('a' , '4');
				
		}
		
		for(int j = 0 ; j < ArrayCiutatsModificades.length ; j++) {
			  Arrays.sort(ArrayCiutatsModificades);
			  
				System.out.println(ArrayCiutatsModificades[j]);
			
		}
		
		
	  }	

}
