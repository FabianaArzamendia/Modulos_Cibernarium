package modulo2;
import java.util.*;

//Fabiana Arzamendia
public class Nivell1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa un numero por favor : ");
		
		int altura= sc.nextInt();
		sc.close();
		
		
	
	for(int i = 1; i <= altura; i++) {
		System.out.println();
		
		int j =0 ;
		while(j  < i ){
				j++;
				System.out.print(j);
					
		}
 }
	
	
 }

}
