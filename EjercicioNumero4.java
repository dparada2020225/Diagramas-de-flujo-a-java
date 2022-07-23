//importamos la clase scanner
import java.util.Scanner;
//importamos la clase BufferedReader
import java.io.*;

	//abrimos la clase conel nombre EjercicioNumero4
	public class EjercicioNumero4{
		//utilizamos la funcion main par ejecutar la clase
		public static void main(String[] args) {
		
		//invocamos a scanner
		Scanner datos = new Scanner(System.in);
		//defini unkilometro como 1000.0 que son los metros que tiene un kilometro
		Double unkilometro =1000.0;
		//defini la variante km
		Double km;
		 //mane a imprimir un mansaje para que  el usuario meta datos
		System.out.println("ingrse la cantidad de km/h para convertir a m/s (acepta decimales)");
			//pedimos datos al usuario
			km = datos.nextDouble();
		// definimos la variante resp como la multiplicacion de km*unkilometro
		Double resp = km*unkilometro;

       	//mandamos a imprimir el resultado
		System.out.println(" el resultado es: " + resp + "m/s");
		}
	}