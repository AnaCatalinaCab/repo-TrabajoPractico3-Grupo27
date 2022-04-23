package ejercicio5.fi.unju.edu.ar;

import java.util.Scanner;

public class PrincipalPunto5 {

	public static void main(String[] args) {
			
			Scanner ingreso1 = new Scanner(System.in);
			System.out.println("Ingrese cadena de texto: ");
			String sCadena = ingreso1.nextLine();
			
			String reverseStr = reverseIt(sCadena, sCadena.length()-1);
			System.out.println(reverseStr);
		}
		static String reverseIt(String str, int index){
			if(index == 0){
				return str.charAt(0) + "";
			}
			char letter = str.charAt(index);
			return letter + reverseIt(str, index-1);
		}

	}


