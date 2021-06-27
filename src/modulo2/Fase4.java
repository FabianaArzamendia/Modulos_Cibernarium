package modulo2;

import java.util.ArrayList;
import java.util.List;

//Fabiana Arzamendia
public class Fase4 {
	public static void main(String[] args) {
		List<Character> name = new ArrayList<Character>();
		
		List<Character> surname = new ArrayList<Character>();
		
		
		name.add('L');
		name.add('E');
		name.add('O');
		name.add(' ');
		
		surname.add('M');
		surname.add('E');
		surname.add('S');
		surname.add('S');
		surname.add('I');
		
		List <Character> result_list = new ArrayList<Character>(name);
		result_list.addAll(surname);
				
		System.out.println();
		System.out.print("FULLNAME:[");
		for(int k =0 ; k < result_list.size(); k++) {
			System.out.print(result_list.get(k));
			System.out.print(',');
			
			
		}
		
		System.out.println("]");
		
		
	}

}
