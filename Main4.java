package lab01;
import java.util.Scanner;

public class Main4 {
	public class Main {
	    // Función que recibe tres números decimales
	    public static double encontrarMinimo(double valorA, double valorB, double valorC) {

	        // Inicialmente se considera al primer número como el menor
	        double minimo = valorA;
	        // Se compara el segundo número con el menor actual
	        if (valorB < minimo) {

	            // Si es menor, se guarda como nuevo menor
	            minimo = valorB;
	        }
	        // Se compara el tercer número con el menor actual
	        if (valorC < minimo) {

	            // Si es menor, se guarda como nuevo menor
	            minimo = valorC;
	        }
	        // Se devuelve el número menor
	        return minimo;
	    }

	    public static void main(String[] args) {

	        // Se crea Scanner
	        Scanner lector = new Scanner(System.in);

	        // Se solicita el primer número
	        System.out.print("Ingrese el primer número: ");
	        double primerValor = lector.nextDouble();

	        // Se solicita el segundo número
	        System.out.print("Ingrese el segundo número: ");
	        double segundoValor = lector.nextDouble();

	        // Se solicita el tercer número
	        System.out.print("Ingrese el tercer número: ");
	        double tercerValor = lector.nextDouble();

	        // Se llama a la función y se muestra el resultado
	        System.out.println("El menor es: " +
	                encontrarMinimo(primerValor, segundoValor, tercerValor));

	        lector.close();
	    }
	}

}
