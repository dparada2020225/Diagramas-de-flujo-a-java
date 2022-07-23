//importamos la clase scanner
import java.util.Scanner;
//importamos la clase BufferedReader
import java.io.*;
	
	//abri la clase con el nomcre de EjercicioNumero5
	public class EjercicioNumero5{
		
		//utilizamos la funcion main pra ejecutar la clase
		public static void main(String[] args) {
		
			//invocamos a scanner
			Scanner datos = new Scanner(System.in);
		 	    //definimos la variante n1
		 		Double n1;
				//definimos la variente n2
				double n2;
				//definimos la variante a para utilizarla con BufferedReader
				String a= null;
		
			//mande a imprimir que el suario de un vaolo para n1
			System.out.println("ingrese el primer numero");
				
				//mande a pedir datos al usuario
				n1 = datos.nextDouble();
			
			//mande a imprimir que el suario de un vaolo para n1
			System.out.println("ingrese el segundo numero");
				
				//mande a pedir datos al usuario
				n2 = datos.nextDouble();

			//mande a imprimir preguntando al usuario que quire hacer
			System.out.println("que desea hacer ");
		
			//mande a imprimir si el usuario queria sumar que escribiera sumar
			System.out.println("sumar escriba: sumar");
		

			//mande a imprimir si el usuario queria resta que escribiera restar
			System.out.println("restar escriba: restar");
			

			//mande a imprimir si el usuario queria multiplicar que escribiera multiplcar
			System.out.println("multiplicar escriba: multiplicar");
			

			//mande a imprimir si el usuario queria dividir que escribiera dividir
			System.out.println("dividir escriba: dividir");
			a = datos.nextLine();
			
			//mande a llamar al BufferedReader
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try { 
			//made a pedir datos para la variante a
				a = entrada.readLine();
			} catch (IOException ioe) {
				System.out.println( "error de I/O");
				System.exit(1);
			}
			//defini la variante suma como n1+n2
			Double suma =n1+n2;
			
			//defini la variante resta como n1-n2
			Double resta =n1-n2;
			
			//defini la variante multiplicacion como n1*n2
			Double multiplicacion =n1*n2;
			
			//defini la variante divicion como n1/n2
			Double divicion =n1/n2;
			
			
			//utilice un switch con la variante a para definir la accion
			switch (a) {
				//defini el caso sumar con la imprecion "el resultado de la suma es " + suma
				case "sumar":
					System.out.println("el resultado de la suma es " + suma);
					break;
				//defini el caso restar con la imprecion "el resultado de la resta es " + resta
				case "restar":
					System.out.println("el resultado de la resta es " + resta);
					break;
				//defini el caso multiplicar con la inprecion "el resultado de la multiplicacion es " + multiplicacion
				case "multiplicar":
					System.out.println("el resultado de la multiplicacion es " + multiplicacion);
					break;
				//defini el caso dividir con la imprecion "el resultado de la divicion es " + divicion)
				case "dividir":
					System.out.println("el resultado de la divicion es " + divicion);
					break;


			}


	}
}
