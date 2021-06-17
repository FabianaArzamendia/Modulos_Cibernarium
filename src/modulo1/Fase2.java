package modulo1;

//Fabiana Arzamendia
public class Fase2 {
	public static void main(String[] args) {
		
		final int any = 1948;
		int any_traspas = 4;
		int count = 0;
		
		System.out.println("Anys traspas des de 1948 fins 1987: ");
		
		for(int i = any ; i < 1987 ; i+= any_traspas) { 
			if((any % any_traspas == 0) && ((any % 100 != 0) || (any % 400 == 0 ))){
			
				System.out.print(i + " ");
				count++;
			
			}
			else {
				System.out.println("No es traspas " + i);
			}
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Entre 1948 y 1987 hay " + count + " anys de traspas. ");
		
	}
	

}
