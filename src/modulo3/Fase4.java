package modulo3;

public class Fase4 {
	
	public static void main(String[] args) {
		
		String roma = "Roma";
		int long_roma = roma.length();
		int l =0;
				
		char [] array_roma = new char [long_roma];
		
		
		System.out.println("Ciutats amb els noms invertits");
						
		System.out.print("Roma - ");
		for(int i = long_roma ; i > 0  ; i-- ) {
			array_roma[l]= roma.charAt(i -1);
			System.out.print(array_roma[l]);
		}	
		
		
		
		
		String lisboa = "Lisboa";
		int long_lisboa = lisboa.length();
		int k =0;
				
		char [] array_Lisboa = new char [long_lisboa];
		
		System.out.println();
		System.out.print("Lisboa - ");
		for(int i = long_lisboa ; i > 0  ; i-- ) {
			array_Lisboa[k]= lisboa.charAt(i -1);
			System.out.print(array_Lisboa[k]);
		}
		
		
		String napoles = "Napoles";
		int long_napoles = napoles.length();
		int j =0;
				
		char [] array_napoles = new char [long_napoles];
		
		System.out.println();
		System.out.print("Napoles - ");
		for(int i = long_napoles ; i > 0  ; i-- ) {
			array_napoles[j]= napoles.charAt(i -1);
			System.out.print(array_napoles[j]);
		}
		
		
		String berlin = "Berlin";
		int long_berlin = berlin.length();
		int b =0;
				
		char [] array_berlin = new char [long_berlin];
		
		System.out.println();
		System.out.print("Berlin - ");
		for(int i = long_berlin; i > 0  ; i-- ) {
			array_berlin[b]= berlin.charAt(i -1);
			System.out.print(array_berlin[b]);
		}	
		
		
		String barcelona = "Barcelona";
		int long_barcelona = barcelona.length();
		int n =0;
				
		char [] array_barcelona = new char [long_barcelona];
		
		System.out.println();
		System.out.print("Barcelona - ");
		for(int i = long_barcelona ; i > 0  ; i-- ) {
			array_barcelona[n]= barcelona.charAt(i -1);
			System.out.print(array_barcelona[n]);
			
		}	
		
		
		String madrid = "Madrid";
		int long_madrid = madrid.length();
		int m =0;
				
		char [] array_madrid = new char [long_madrid];
		
		System.out.println();
		System.out.print("Madrid - ");
		for(int i = long_madrid ; i > 0  ; i-- ) {
			array_madrid[m]= madrid.charAt(i -1);
			System.out.print(array_madrid[m]);
		}	
		
			
	
		
	}
	
}
