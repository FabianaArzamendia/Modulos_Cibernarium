package modulo3;

import java.util.*;

public class Nivell2 {
	
	public static void main(String[] args) {
		final int alumno = 5;
		final int nota = 3;
		
		int suma;
		int media =0;
		
		Scanner sc = new Scanner(System.in);
		
		int [][] NotasAlumnos= new int[nota][alumno];
		
		
			
		for(int  i= 0 ; i < nota ; i++) {
			System.out.print("Introduix la nota  " + (i+1));
			for(int j = 0 ; j < alumno ; j++) {
				System.out.println(" per alumno: " + j);
				 System.out.print("NotasAlumnos  [" + i + "][" + j + "]= ");
				NotasAlumnos[i][j] =sc.nextInt();
				
			}
			System.out.println();
			
			
		}
		sc.close();
	
			
	
		
		System.out.println();
		System.out.println("VALORES INGRESADOS A LA MATRIZ ");
		for(int k =0 ; k < nota; k++) {
			for(int j =0 ; j < alumno ; j++) {
				System.out.print(NotasAlumnos[k][j]);
				
			}
			System.out.println();
		}
		
		System.out.println("***Calcular la media***");
		for(int i = 0 ; i < NotasAlumnos[0].length ; i++) {
			   suma=0 ;
			for(int j = 0 ; j < NotasAlumnos.length; j++) {
				 suma = suma +  NotasAlumnos[j][i];
				 media =suma/3;
						
				
			}
			 System.out.print("Alumno [" + i + "]= ");
			System.out.print(" tiene una media de = " + media);
			
			if(media >= 5 ) {
				for(int k = 0 ; k  < NotasAlumnos.length ; k++) {
					for(int j= 0 ; j < NotasAlumnos.length ; j++) {
												
					}
					
				}
				System.out.println(" has aprovado" );
				
			}
			else {
				System.out.println(" estas suspendido");
			}
			
			
					
		}
		
		
		
	}

}
