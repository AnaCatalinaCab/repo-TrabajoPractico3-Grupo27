package ar.edu.unju.fi.Punto09;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;



public class Punto09 {
	static ArrayList<Producto> listaProducto = new ArrayList<Producto>();
	
	public static void main(String[] args) {
		int opcion = 10;
		do {
			System.out.println("");
			System.out.println("*************************************************");
			System.out.println("* 1 - Nuevo Producto                            *");
			System.out.println("* 2 - Mostrar todos los productos               *");
			System.out.println("* 3 - Incrementar precio a todos los productos  *");
			System.out.println("* 4 - Monto total de todos los productos        *");
			System.out.println("* 5 - Salir                                     *");
			System.out.println("*************************************************");
	
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("Elija una opcion: ");
			opcion = scanner1.nextInt();
			
		switch(opcion) {
		case 1:
			ingresarProducto();
			break;
		case 2:
			System.out.println("Lista de productos: ");
			mostrarProductos();
			break;
		case 3:
			System.out.println("Incrementar 100,25 al precio de los productos: ");
			incrementarPrecio();
			mostrarProductos();
			break;
		case 4:
			montoTotalProducto();
			break;
		case 5:
			System.out.println("Hasta Pronto!");
			
			break;
		default:
			System.out.println("Opcion incorrecta");
		}
		}while(opcion != 5);
	}
	
		public static void ingresarProducto() {
			System.out.println("-- Ingrese datos del nuevo producto --");
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("Ingrese el codigo: ");
			int codigo = (int) scanner1.nextInt();
			Scanner scanner2 = new Scanner(System.in);
			System.out.print("Ingrese la decripcion: ");
			String descripcion = (String) scanner2.nextLine();
			Scanner scanner3 = new Scanner(System.in);
			System.out.print("Ingrese el precio: ");
			float precio = (float) scanner3.nextFloat();
			Scanner scanner4 = new Scanner(System.in);
			System.out.print("Ingrese la marca: ");
			String marca = scanner4.nextLine();
			Producto productoNuevo = new Producto(codigo, descripcion, precio, marca);
			agregarProducto(productoNuevo);
		}

		public static void agregarProducto(Producto nuevoProducto){
			listaProducto.add(nuevoProducto);
			mostrarProductos();
			
		}
		
		public static void mostrarProductos() {
			for(Producto lista: listaProducto) {
				System.out.println("+------------------------------");
				System.out.println("| Codigo: "+lista.getCodigo());
				System.out.println("| Descripcion: "+lista.getDescripcion());
				System.out.println("| Precio: $"+lista.getPrecio());
				System.out.println("| Marca: "+lista.getMarca());
			}
			
		
		}
		
		public static void incrementarPrecio() {
			for(Producto lista: listaProducto) {
				lista.incrementarPrecio();
			}
		}
		
		public static void montoTotalProducto(){
			double total = 0.0;
			for(Producto lista: listaProducto) {
				total = total + lista.getPrecio();
			}
			System.out.println("El monto total de los productos es: " + total);
		}
		
}