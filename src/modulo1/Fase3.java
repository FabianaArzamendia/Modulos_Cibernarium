package modulo1;

//Fabiana Arzamendia
public class Fase3 {
	public static void main(String[] args ) {
		int any= 1948;
		int any_naxi = 1987;
		boolean flag = true;
		
		String es_traspas= "L'any 1987 es de traspas ";
		String no_traspas = "L'any 1987  no es de traspas ";
		
		for(int i = any ; i <= any_naxi; i++) {
			if((any_naxi % 4 == 0) && ((any_naxi % 100 != 0) || (any_naxi % 400 == 0))) {
							
			}
		
			else {
					flag = false;
			
			}	
			
		
			
		}
		
		if(flag) {
			System.out.println(es_traspas);
			
		}
		else {
			System.out.println(no_traspas);
			
		}
		
		
			
		
		
		
	}

}
