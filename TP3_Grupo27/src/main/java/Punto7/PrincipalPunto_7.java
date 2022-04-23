package Punto7;

import java.util.*;

public class PrincipalPunto_7 {
	public static void main(String[] args) {
		ArrayList<String> nombresFrutas = new ArrayList<String>();
		char continuar= 's';
		String respuesta;
		do {
			
			Scanner respuestaDelUsuario = new Scanner(System.in);
			System.out.println("Ingrese el nombre de la fruta: ");
			respuesta = respuestaDelUsuario.nextLine();
			nombresFrutas.add(respuesta);
			System.out.println("quiere ingresar otro nombre de fruta? s/n:  ");
			continuar = respuestaDelUsuario.nextLine().charAt(0);
		}while(continuar=='S' || continuar=='s');
		
		for(int i=0;i<nombresFrutas.size();i++){
		   if(i%2==0 && i>=2){
			   System.out.println("posicion: "+ i + " nombre de la fruta: " + nombresFrutas.get(i));   
		   }
		}  
		
	
		
	}
		
}
