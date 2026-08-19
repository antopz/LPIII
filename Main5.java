package lab01;
import java.util.Scanner;
public class Main5 {
	public class Main {

	    // Función que recibe el tiempo de estacionamiento
	    // y devuelve el costo correspondiente
	    public static double obtenerCosto(int tiempo) {

	        // Variable para almacenar el monto a pagar
	        double monto;

	        // Si se utiliza una hora o menos, se cobran S/3.00
	        if (tiempo <= 1) {

	            monto = 3.00;

	        } else {

	            // Se cobran S/3.00 por la primera hora
	            // y S/0.50 por cada hora adicional
	            monto = 3.00 + (tiempo - 1) * 0.50;
	        }

	        // Se verifica que el monto no supere S/12.00
	        if (monto > 12.00) {

	            monto = 12.00;
	        }

	        // Se devuelve el monto calculado
	        return monto;
	    }

	    public static void main(String[] args) {

	        // Se crea Scanner
	        Scanner lector = new Scanner(System.in);

	        // Se solicitan las horas
	        System.out.print("Ingrese el número de horas: ");

	        int tiempoUsado = lector.nextInt();

	        // Se calcula y muestra el monto
	        System.out.println("El cargo es: S/" +
	                obtenerCosto(tiempoUsado));

	        lector.close();
	    }
	}

}
