package modulo1;

//Fabiana Arzamendia
public class Fase4 {
	public static void main(String[] args) {
		String nom = "Lionel";
		String cognom = "Messi Cuccittini";
		
		int dia = 24;
		int mes = 6;
		int any = 1987;
		
				
		System.out.println("El meu nom es " + nom + " " + cognom + ".");
		System.out.println("Vaig neixer el  " + dia + "/" + mes + "/" + any + ".");
		
		if((any  % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))) {
			System.out.println("L'any 1987 es de traspas. ");
			
		}
		else {
			System.out.println("L'any 1987  no es de traspas. ");
		}
		
		
	}

}
