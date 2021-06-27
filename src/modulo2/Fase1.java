package modulo2;

import java.util.Scanner;
//Fabiana Arzamendia

public class Fase1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		char []letra = new char[50];
		
		System.out.print ("Ingresa un nombre por favor : "); 
				
	    letra = sc.nextLine().toCharArray();
	    sc.close();
	    	 
	    for(int i = 0 ; i <= letra.length -1 ; i++ )
	    
	    	System.out.print("[" + letra[i] + "] ");
	
	  
	  
	}


	    
	    

	

}
