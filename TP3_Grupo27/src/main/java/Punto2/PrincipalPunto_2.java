package Punto2;

import java.util.Scanner;

public class PrincipalPunto_2 {

	public static void main(String[] args) {
		int respuesta=0;
		int totales=0;
		;
		char Continuar = 'S';
		do{
			Scanner respuestaDelUsuario = new Scanner(System.in);
			System.out.println("Ingrese un numero del 1 al 9: ");
			respuesta = respuestaDelUsuario.nextInt();
			int arreglomultiplicaciones []= { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			if(respuesta >0 && respuesta<10){
				System.out.println("La tabla del numero "+respuesta + " es:");
				for(int i=0; i < arreglomultiplicaciones.length;i++){
					int resultados =arreglomultiplicaciones[i] * respuesta;
					totales= resultados;
			        System.out.println( i+"*"+respuesta +"=" + resultados +" ");
				}
				Scanner deseaSeguir = new Scanner(System.in);
				System.out.println("Quiere ver la tabla de otro numero? S/N ");
				Continuar = deseaSeguir.nextLine().charAt(0);
			}else {
				System.out.println("Valor no valido, ingrese otro valor: ");
				}
		}while(Continuar=='S' || Continuar=='s');
	}
}
