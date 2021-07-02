package modulo2;
import java.util.*;

//Fabiana Arzamendia
public class Nivell2 {
	public static void main(String[] args) {
		
		int altura;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa la altura del triangulo: ");
		
		altura = sc.nextInt();
		sc.close();
		
			for(int i = altura ; i >= 0 ; i--) {
			
				//calculo espacios			
				for(int j =1; j <= altura -i ;  j++) {
					System.out.print(" ");
				
			}
			//dibujo asteriscos
			for(int k = 1 ; k <= (i*2) - 1   ; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}

}
