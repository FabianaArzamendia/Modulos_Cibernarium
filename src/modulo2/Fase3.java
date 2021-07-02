package modulo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Fabiana Arzamendia
public class Fase3 {
	public static void main(String[] args) {
		int count_l = 0;
		int count_o = 0;
		int count_i = 0;
		int count_m = 0;
		int count_s = 0;
		int count_e = 0;
		Map<Character , Integer> namekey = new HashMap<Character ,Integer>();
				
		List<Character> listchar = new ArrayList<Character>();
		
		listchar.add('L');
		listchar.add('E');
		listchar.add('O');
		listchar.add('M');
		listchar.add('E');
		listchar.add('S');
		listchar.add('S');
		listchar.add('I');
		
		for(int i = 0 ; i< listchar.size() ; i++) {
			
			if(listchar.get(i)== 'L') {
			    count_l++;
			    namekey.put('L',  count_l);
			   			    
			}
						
			if(listchar.get(i)== 'E') {
			    count_e++;
			    namekey.put('E',  count_e);
			   
			}
						
			if(listchar.get(i)== 'O') {
			    count_o++;
			    namekey.put('O',  count_o);
			}
			
			if(listchar.get(i)== 'M') {
			    count_m++;
			    namekey.put('M',  count_m);
			  
			}
			
			if(listchar.get(i)== 'S') {
			    count_s++;
			    namekey.put('S',  count_s);
			  
			}
			
			if(listchar.get(i)== 'I') {
			    count_i++;
			    namekey.put('I',  count_i);
			  
			    
			}
		
		
				
			
		}
		
		System.out.println();
		System.out.print(namekey);
	}

}
