package ejercicio4.fi.unju.edu.ar;

import java.util.Scanner;

public class PrincipalPunto4 {

	public static void main(String[] args) {
		Scanner ingreso1 = new Scanner(System.in);
		int[] arreglo1 = new int[8];
		
		for(int i=0;i<arreglo1.length;i++) {
			System.out.println("Ingrese el valor : "+(i+1));
			arreglo1 [i]= ingreso1.nextInt();
		}
		
		System.out.print("Los valores del arreglo 1 son: "); 
		for (int i:arreglo1) {
			 if (i % 2 == 0) {
		            System.out.println(i+" Sí es par");
		        } else {
		            System.out.println(i+" No es par");
		        }
		
		}	
	}
}
