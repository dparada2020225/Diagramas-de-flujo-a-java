//importamos la clase scanner
import java.util.Scanner; 

//importamos la clase BufferedReader
import java.io.*;

	
	//abrimos la clase con el nombre de  EjercicioNumero2
	public class EjercicioNumero2{
		
		//utilizamos la funcion main para ejecutar la clase
		public static void main(String[] args) {
			// definimos la variante a para utilizarla con BufferedReader
			
			String a = null;
			//definimos la variante base, altura pra utilizarla con scanner
			double base;
			double altura;
			
			//invocamos a scanner
			Scanner datos = new Scanner(System.in);

			//mandamos a imprimir pidiendo un dato para base
			System.out.println("ingrese un numero positivo para la Base: ");
			//pedimos datos al usuario
			base = datos.nextDouble();

			///mandamos a imprimir pidiendo un dato para altura
			System.out.println("ingrese un numero positivo para la altura: ");
			//pedimos datos al usuario
			altura = datos.nextDouble();
			
			//mandamos a inprimir para preguntarle al usuario que desea hacer
			System.out.println("que desea sacar  perimetro escriba perimetro, area escriba area..");
			
			//invocamos a BufferedReader
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try { 
				a = entrada.readLine();
			} catch (IOException ioe) {
				System.out.println( "error de I/O");
				System.exit(1);
			}
			//mande a imprimir lo que el usuario puso
			System.out.println("usted puso " + a);


			
			//defini el valor de la base al cuadrado
			double baseAlCuadrado = Math.pow(base,2);
			//de fini el valor de la altura al cuadrado
			double alturaAlcuadrado = Math.pow(altura,2);
			//defini sdba(suma de base por altura)
			double sdba = baseAlCuadrado + alturaAlcuadrado;
			//defini c como la raiz de sdba( auma de base por altura)
			double c = Math.sqrt(sdba );
			//defini abc como la suma de base altura y la variante c
			double abc = base+altura+c;

			//defini lm como base por altura
			double m = base*altura;
			//defini r_area (respueste de area) como m/2
			double r_area = m/2;

			

			//utilize un switch
			switch(a){
				
				//defini el caso para perimetro
				case "perimetro":
				
				//mande a imprimir la primera parate de lo que queria imprimir
				System.out.println("el perimetro del tringulo dado los datos " + base + "= base " + altura +"= altura ");
				//mande a imprimir la segunda parte de lo que queria imprimir
				System.out.println("es: " + abc);
					break;


				//defini el caso para area
				case "area":
				
				//mande a imprimir la primera parte de lo que quiero imprimir
				System.out.println("el area del tringulo dado los datos " + base + " = base " + altura +" = altura ");
				//mande a imprimir la segunda parte de lo que queria inprimir
				System.out.println("es: " + r_area);
					break;
				
				//puse un defaul por si el usuario no colocaba bien algo
				 default:
				 	
				 	//mamde a imprimir el mansaje que aparecera en caso que el usario se consunda
				 	System.out.println("repitalo siga instrucciones XD");

	
			}
			
		}

	}