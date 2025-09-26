package EjercicioEj2;

import java.util.Scanner;

public class EjercicioEj2 {

	public static void main(String[] args) {
		int numhoras;							//Variable para almacenar número horas
		double preciohora;						//Variable para almacenar precio por hora
		double preciototalsinIVA;				//Variable para almacenar precio total sin IVA
		double descuento;						//Variable para almacenar descuento
		double preciototalconIVA;				//Variable para almacenar precio total con IVA
		boolean preciomayor1000;				//Variable boolean para almacenar si el precio es mayor a 1000 , true o false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número de horas trabajadas: ");
		numhoras = sc.nextInt();
	
		System.out.println("Precio por horas: ");
		preciohora = sc.nextDouble();
		
		preciototalsinIVA = numhoras * preciohora;		//Operación para calcular preciototalsinIVA
		
		preciomayor1000 = preciototalsinIVA<1000;		//Comprobamos con el boolean si el precio total sin IVA es menor a 1000
		descuento = preciomayor1000? 0.10 : 0.15;		//Si es menor a 1000 se hace el 10% y sino 15%
		
		preciototalconIVA = preciototalsinIVA * (1-descuento);			//Operación para calcular el precio total con IVA
		System.out.println("El salario total es de: " + preciototalconIVA);
		

	}

}
