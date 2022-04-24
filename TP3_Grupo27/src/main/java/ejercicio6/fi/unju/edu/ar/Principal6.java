package ejercicio6.fi.unju.edu.ar;

import java.util.Scanner;

public class Principal6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cuantos numeros cargara? ");
        int cant;
        cant=teclado.nextInt();
		
		Scanner ingreso1 = new Scanner(System.in);
		int[] numeros = new int[cant];
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Ingrese el valor : "+(i+1));
			numeros [i]= ingreso1.nextInt();
		}
		
		visualizar(numeros);
 
        int[] invertido = new int[numeros.length];
        for(int i=0;i<numeros.length;i++){
            invertido[i] = numeros[numeros.length-1-i];
       }
        numeros = invertido;
        visualizar(numeros);
	
	}
       
        
        private static void visualizar(int[] array){
            String cadena = "Array: ";
            for (int i = 0; i < array.length; i++) {
                cadena += array[i] + ", ";
            }
            cadena = cadena.substring(0, cadena.length()-2);
            System.out.println(cadena);
        }
		
	}	

