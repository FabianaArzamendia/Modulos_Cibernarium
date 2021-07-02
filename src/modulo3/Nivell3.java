package modulo3;

import java.util.*;

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
		 for(int i =0 ; i < num -2 ; i++) {//num 7 -2 = 5 ira hasta 5 el bucle 
			 n2 = n0 + n1; // 0 1   n2 = 1 
			 /* i = 0  n2 =1
			  * i = 1  n3 =2
			  * i = 2  n4 =3
			  * i = 3  n5 =5
			  * i = 4  n6 =8
			  */
			 n0 = n1;//n0 1  
			 n1 = n2;//n1 1
			 
			 System.out.print(" "  + n2 + " ");
			 
			}
			 
			 
		 }
		 
	

}
