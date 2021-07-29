package modulo2;

import java.util.ArrayList;
import java.util.List;

//Fabiana Arzamendia
public class Fase2 {
	public static void main(String[] args) {
		
		char[] vocal = {'a','e','i','o','u'};
		char[] consonante = { 'b', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v','x', 'y', 'z'};
		int [] numero = {0,1,2,3,4,5,6,7,8,9};
		List<Character> listchar = new ArrayList<Character>();
		listchar.add('l');
		listchar.add('e');
		listchar.add('o');
		listchar.add('m');
		listchar.add('e');
		listchar.add('s');
		listchar.add('s');
		listchar.add('i');
		
		
		
		for(int i = 0 ; i < listchar.size() ; i++) {
			
			for(int j = 0 ; j < vocal.length ; j++) {
				if(listchar.get(i)==vocal[j]) {
					System.out.println(listchar.get(i) + "  Vocal");
					
				}
				
			}	
			
				for(int k =0 ; k < consonante.length ; k++) {
					if(listchar.get(i)== consonante[k]) {
						System.out.println(listchar.get(i) + " Consonante");
						
					}
				}
				
				for(int n = 0 ; n < numero.length ; n++) {
					if(listchar.get(i)==numero[n]) {
						System.out.println("Els noms de persones no contenen números");
					}
				}
				
			
			
			
				
				
			
		}
		
	}

}
