package modulo3;

import java.util.*;

//FabianaArzamendia
public class Nivell3 {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		 System.out.println("Ingresa un numero para calcular la sequencia de fibonacci: ");
		 
		 num = sc.nextInt();
		 int n0 = 0;
		 int n1 = 1;
		 int n2 = 0;
		
		 System.out.print(n0 + " " + n1);
		 for(int i =0 ; i < num -2 ; i++) {
			 n2 = n0 + n1; 
			
			 n0 = n1;
			 n1 = n2;
			 
			 System.out.print(" "  + n2 + " ");
			 
			}
			 
			 
		 }
		 
	

}
