//importamos la libreria de java (scanner)
import java.util.Scanner;

// creamos la clase con el nombre de EjercicioNumero1
public class EjercicioNumero1 {
	//ponemos la funcion main para ejeecutar la clase
	public static void main(String[] args) {
		
		//invocamos al scanner
		Scanner datos = new Scanner(System.in);
			
			// definimos las variante numero 1 y numero 2
			double numero1;
			double numero2;
		//mandamos a imprimir 		
		System.out.println("los numeros pueden llevar decimales...");
		System.out.println("ingrse el primer numero a comparar: ");
			//pedimos al usuario que ingrese un valor para numero1
			numero1 = datos.nextDouble();
		
		//mandamos a imprimir los proseso llevados a cabo
		System.out.println("el numero que ingreso fue: " + numero1);
		
		System.out.println("ingrese el segundo numero a comparar");
			//pedimos al usuario que ingrse un valor para numero2 
			numero2 = datos.nextDouble();
		//mandamos a imprimir los proseso llevados a cavo
		System.out.println("el numero que ingreso fue: " + numero2);
		//mandamoas a imprimir
		System.out.println("los numero " + numero1 + " y " + numero2 + 
			" los cuales ingreso quedan ordenados de la siguiente manera:");

		/*aca utilizamos un if para poder comparar y que se hiciera mas facil al momento de que la 
		expresion fuera falsa*/
		if (numero1>numero2) {
			//mandamos a imprimir si y solo si la expresion del if es verdadera
			System.out.println(numero2 + "," + numero1);
				//utilizamos un else para decir que la expresion del if es falsa
				} else {
					//mandamos a imprimir si y solo si la expresion del if es falsa
					System.out.println(numero1 + "," + numero2);
		}
	
	} 
}