//importe la clase scanner
import java.util.Scanner;
//importe la clase BufferedReader
import java.io.*;

//abri la clase con el nombre de EjercicioNumero3
public class EjercicioNumero3{
	//puse la funcion main par ejecutar la classe
	public static void main(String[] args) {
		
		//invoque a scanner
		Scanner datos = new Scanner(System.in);
		//defini metrospies como 3.28
		Double metrospies= 3.28;
		//defini la variante metros
		Double metros;
		//mande a imprimir para que el usuario sepa que hay que ingresar datos
		System.out.println("ingrese la cantidad de metros a convertir a pies:");
		//pedimos datos al usuarioo
		metros = datos.nextDouble();
		//definimos la variante respuesta como la variante metros por metrospies
		Double respuesta = metros*metrospies;
		//mandamos a imprimir la respuesta
		System.out.println("el resultado de la convercion es: " + respuesta+ " ft");

	}
}