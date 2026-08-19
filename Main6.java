package lab01;
import java.util.Scanner;
public class Main6 {
	public class Main {

	    public static void main(String[] args) {

	        // Se crea Scanner para leer los datos
	        Scanner lector = new Scanner(System.in);

	        // Se solicitan las horas
	        System.out.print("Ingrese las horas: ");
	        int cantidadHoras = lector.nextInt();

	        // Se solicitan los minutos
	        System.out.print("Ingrese los minutos: ");
	        int cantidadMinutos = lector.nextInt();

	        // Se solicitan los segundos
	        System.out.print("Ingrese los segundos: ");
	        int cantidadSegundos = lector.nextInt();

	        // Se convierten las horas a segundos
	        // y los minutos a segundos
	        // Luego se suman los segundos ingresados
	        int resultado = cantidadHoras * 3600
	                      + cantidadMinutos * 60
	                      + cantidadSegundos;

	        // Se muestra el resultado
	        System.out.println("El equivalente es: "
	                + resultado + " segundos");

	        lector.close();
	    }
	}

}
