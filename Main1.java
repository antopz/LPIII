package lab01;

public class Main1 {
	public class main {

	    // Función que recibe un arreglo de números enteros
	    // y devuelve la suma de todos sus elementos
	    public static int calcularTotal(int[] valores) {

	        // Variable donde se acumulará el resultado
	        int total = 0;

	        // Se recorre todo el arreglo
	        for (int posicion = 0; posicion < valores.length; posicion++) {

	            // Se suma cada elemento del arreglo
	            total = total + valores[posicion];

	        }

	        // Se devuelve el resultado obtenido
	        return total;
	    }

	    public static void main(String[] args) {

	        // Se crea un arreglo con 5 números
	        int[] lista = {1, 2, 3, 4, 5};

	        // Se llama a la función y se muestra el resultado
	        System.out.println("La suma es: " + calcularTotal(lista));

	    }
	}

}
