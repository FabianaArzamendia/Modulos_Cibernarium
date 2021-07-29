package modulo4;


import java.util.Map.Entry;
import java.util.*;


public class Plats {
		
	
	public Plats() {
		
	}
		
	public static void muestraPlat(HashMap<String, Integer> preuPlat) {
		
		int contador = 0;
		
		String [] plats = new String[10];
		int  [] preus = new int[10];
		
		System.out.println("********* Plats del dia *********");
		for(Map.Entry<String, Integer> entry : preuPlat.entrySet()) {
			plats[contador] = entry.getKey();
			preus[contador] = entry.getValue();
			contador++;
			System.out.println("Plat "  + contador + ": " + entry.getKey() + "," +   entry.getValue());
		}
		
	}
	
	
	public static void ClienElige(HashMap<String, Integer> preuPlat) {
		List<Integer>precio_plat = new ArrayList<Integer>();
		
		Scanner sc =  new Scanner(System.in);
		ArrayList<String> Clientplats = new ArrayList<String>();
		int m1 = 1;
		int m2 = 2;
		int b5 = 5;
		int b10 = 10;
		int b20 = 20;
		int b50 = 50;
		int b100 = 100;
		int b200 = 200;
		int b500 = 500;
		
		
		int precio=0;
		 String elige = "Si";
		
		 System.out.println("Ingresa que plats vol menjar :");
		 elige = sc.nextLine();
		
			
		while(!elige.equals("No") ) {
						 
			 if(preuPlat.containsKey(elige)) {
				 System.out.println("si existe este plato");
				 Clientplats.add(elige);
				 
			}
			 else {
				 System.out.println("No tenemos este plato");
			 }
			 
					
			 System.out.println("Desea seguir ordenando comida? :");
			 elige = sc.nextLine();		
				
			
		}
		System.out.println(Clientplats);
		int preuTotal=0;
		try {
			
			 for(int i = 0 ; i < Clientplats.size() ;i++) {
				 System.out.println("Ingresa precio " + i);
				
				 precio = sc.nextInt();
				 precio_plat.add(precio);
				 preuTotal += precio_plat.get(i);
				 System.out.println(precio_plat);
							 
			 }
			
		}catch(InputMismatchException ex) {
			System.out.println(ex.getMessage());
			 System.out.println("Debes ingresar un numero entero");
		}finally {
			System.out.println("Exception tratada");
		}
		
		try {
			 System.out.println("El total a pagar es  : " + preuTotal + " euros, gracias.");
			 if(preuTotal <= 10) {
				 System.out.println("Puede saldar su cuenta con el billete de " + b10 + " euros.");
				 b10 = b10 % preuTotal;
				 System.out.println("su saldo es de : " + b10 + " euro.");
				 
			 }
			 else if(preuTotal > 10 && preuTotal < 12 ) {
				 System.out.println("Puede saldar su cuenta con el billete de " + b10 + " euros y la moneda de " + m1);
				 b10 = b10 + m1;
				 b10 = b10 % preuTotal;
				 System.out.println("su saldo es de : " + b10 + " euro.");
			 }
			 else if(preuTotal  <= 12) {
				 System.out.println("Puede pagarlo con el billete de " + b10 + "y con monedas de " + m2);
				 b10 = b10 + m2;
				 b10 = b10 % preuTotal;
				 System.out.println("su saldo es de : " + b10 + " euro.");
			 }
			 else if(preuTotal <= 13) {
				 System.out.println("Puede pagarlo con el billete de " + b10 + " y las monedas de " + m2 + " euros  y" + m1 + "euro");
				 b10 = b10 + m2 + m1;
				 b10 = b10 % preuTotal;
			 }
			 else if (preuTotal <= 17) {
				 System.out.println("Puede pagarlo con el billete de " + b10 +  " mas el billete de " + b5 + " euros" + " y las monedas de " + m2 + " euros");
				 b10 = b10 +b5 + m2;
				 b10 = b10 % preuTotal;
			 }
			 else if(preuTotal <= 18) {
				 System.out.println("Puede pagarlo con el billete de " + b10 +  " mas el billete de " + b5 + " euros" + " y las monedas de " + m2 + " euros" + " y de " + m1);
				 b10 = b10 +b5 + m2 + m1;
				 b10 = b10 % preuTotal;
			 }
			 else if (preuTotal <= 25) {
				 System.out.println("Puede pagarlo con el billete de " + b20 + " euros y el " + b5 + " euros" );
				 b20 = b20 + b5;
				 b20  =b20 % preuTotal;
				 System.out.println("su saldo es de : " + b20 + " euro.");
				
			 }
			 else if (preuTotal <= 50){
				 System.out.println("Puede pagarlo con el billete de " + b50 + " euros");
				  b50 =b50 % preuTotal;
				 System.out.println("su saldo es de : " + b50 + " euro.");
				
			 }
			 else if (preuTotal <= 100) {
				 System.out.println("Puede pagarlo con el billete de " + b100 + " euros");
				 b100  =b100 % preuTotal;
				 System.out.println("su saldo es de : " + b100 + " euro.");
				
			 }else if (preuTotal <= 200) {
				 System.out.println("Puede pagarlo con el billete de " + b200 + " euros");
				 b200  =b200 % preuTotal;
				 System.out.println("su saldo es de : " + b200 + " euro.");
				
			 }
			 else if (preuTotal <= 500) {
				 System.out.println("Puede pagarlo con el billete de " + b500 + " euros");
				 b500 =b500 % preuTotal;
				 System.out.println("su saldo es de : " + b500 + " euro.");
				
			 }
			
		}catch(ArithmeticException e) {
			System.out.println("No se puede realizar una division de 0 valor.\n" + e.getMessage());
		}
		
		
	}

	
	
	
	
	
	

public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	HashMap<String, Integer> preuPlat = new HashMap<String, Integer>();
		
	int opcion;
	do {
		
	System.out.println("*****************************************");
	System.out.println("1 - Ingresa plato del dia.              *");
	System.out.println("2 - Ver plato del dia.                  *");
	System.out.println("3 - Elegir plato.                       *");
	System.out.println("0 - salir.                              *");
	System.out.println("*****************************************");
	System.out.println("Ingresa una opcion: ");
	opcion = sc.nextInt();
	
	switch(opcion) {
	case 1:
		preuPlat.put("Bufalina",12);
		preuPlat.put("4 Formaggi", 12);
		preuPlat.put("Pino Danielle", 18);
		preuPlat.put("Margherita", 9);
		preuPlat.put("Prosciutto", 10);
		preuPlat.put("Parmiggiana", 11);
		preuPlat.put("Al Tonno", 13);
		preuPlat.put("Carbonara", 11);
		preuPlat.put("Massimo Troise", 17);
		preuPlat.put("Ortolana", 12);
		
		System.out.println();
		System.out.print(preuPlat);
		System.out.println();
		
		break;
		
	case 2:
		 Plats.muestraPlat(preuPlat);
		 break;
		 
	case 3:
		 Plats.ClienElige(preuPlat);
		 break;
	case 4:
		default:
			System.out.println("Fin del programa ");
		
	
	}
	
	
	}while(opcion!=0);	
	
	
	
	
				
	
	}	



}
