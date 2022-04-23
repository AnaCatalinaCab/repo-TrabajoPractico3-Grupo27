package ejercicio1.fi.unju.edu.ar;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner ingreso1 = new Scanner(System.in);
		int[] arreglo1 = new int[5];
		
		for(int i=0;i<arreglo1.length;i++) {
			System.out.println("Ingrese el valor : "+(i+1));
			arreglo1 [i]= ingreso1.nextInt();
		}
		System.out.print("Los valores del arreglo 1 son: "); 
		for (int i:arreglo1) {
			System.out.print(i + " ");
		}	
		
		System.out.println("");
		System.out.println("Segundo arreglo");
		
		Scanner ingreso2 = new Scanner(System.in);
		int[] arreglo2 = new int[5];
		
		for(int j=0;j<arreglo2.length;j++) {
			System.out.println("Ingrese el valor : "+(j+1));
			arreglo2 [j]= ingreso2.nextInt();
		}
		System.out.print("Los valores del arreglo 1 son: "); 
		for (int j:arreglo2) {
			System.out.print(j + " ");
		}	
		
		System.out.println("");
		System.out.println("Los resultados de las divisiones son: ");
		
		
		calcularDivicion( arreglo1,arreglo2);
	}
		
	public static void calcularDivicion(int a[],int b[]) {
			
			 int resultado [] = new int[a.length];

			    int total = 0;
			    for (int x = 0; x < resultado.length; x++){
			        resultado[x] = a[x] / b[x];
			        total += resultado[x];
			        System.out.print( resultado[x] +" ");
			    }	 
		}
}
