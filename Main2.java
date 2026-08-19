package lab01;
import java.util.Scanner;
public class Main2 {
	public class Main {

	    public static void main(String[] args) {

	        // Se crea Scanner para leer los datos del usuario
	        Scanner lector = new Scanner(System.in);

	        // Se crea un arreglo para guardar 10 números
	        int[] valores = new int[10];

	        // Se repite el proceso 10 veces
	        for (int posicion = 0; posicion < 10; posicion++) {

	            // Se solicita un número
	            System.out.print("Ingrese el número " + (posicion + 1) + ": ");

	            valores[posicion] = lector.nextInt();

	            // Se verifica desde el segundo número
	            // que sea mayor que el número anterior
	            while (posicion > 0 && valores[posicion] <= valores[posicion - 1]) {

	                // Se informa que el número no es válido
	                System.out.println("El número debe ser mayor que el anterior.");

	                // Se solicita nuevamente el número
	                System.out.print("Ingrese nuevamente: ");

	                valores[posicion] = lector.nextInt();
	            }
	        }

	        // Se muestra el arreglo ingresado
	        System.out.println("Los números ingresados son:");

	        // Se recorre el arreglo
	        for (int posicion = 0; posicion < 10; posicion++) {

	            // Se muestra cada número
	            System.out.println(valores[posicion]);
	        }

	        lector.close();
	    }
	} 

}
