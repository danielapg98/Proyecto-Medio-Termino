package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		String nombre;
		String apellidop;
		String apellidom;
		String direccion;
		String rfc;
		int departamento;
		String puesto;
		int anio;
		int mes; 
		int dia; 
		int sueldo;
				
		
		char continuar; 
		char menu;
		
		Empleado [] a = new Empleado[10];
		
		
		do
		{
		System.out.println("Menu - Elige una opción");
		System.out.println("a)Crear empleado");
		System.out.println("b)Borrar empleado");
		System.out.println("c)Modificar empleado");
		System.out.println("d)Terminar");
		
		menu=sc.next().charAt(0);
		
		switch (menu)
		{
			case 'a':
					
				System.out.println("Elegiste la opción a)Crear empleado");
				System.out.println("¿Cuál es tu nombre?");
				Empleado.setNombre(sc.nextLine());
				System.out.println("EL nuevo nombre es=" + Empleado.getNombre());
				
				System.out.println("¿Cuál es tu apellido paterno?");
				Empleado.setApellidoPaterno(sc.nextLine());
				System.out.println("EL nuevo nombre es=" + Empleado.getApellidoPaterno());
				
				System.out.println("¿Cuál es tu apellido materno?");
				Empleado.setApellidoMaterno(sc.nextLine());
				System.out.println("EL nuevo nombre es=" + Empleado.getApellidoMaterno());
				
				
				break;
			case 'b':
				System.out.println("Elegite la opción b)Borrar empleado");
				break;
			case 'c':
				System.out.println("Elegiste la opcion c)Modificar empleado");
				break;
			default:
				break;
			
		}
		
		System.out.println("¿Deseas continuar?(S/N)");
		continuar=sc.next().charAt(0);
		}
		while (continuar=='S');
		
		
		Main [] a = new Main[10];
		a[0]= new Main();
		

	}
	
}
