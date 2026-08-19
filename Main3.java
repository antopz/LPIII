package lab01;

public class Main3 {
	public class Main {

	    public static void main(String[] args) {

	        // Se crea un arreglo de 6 posiciones
	        // Cada posición representa una cara del dado
	        int[] resultados = new int[6];

	        // Se realizan 20000 lanzamientos
	        for (int lanzamiento = 0; lanzamiento < 20000; lanzamiento++) {

	            // Se genera un número aleatorio entre 1 y 6
	            int cara = (int)(Math.random() * 6) + 1;

	            // Se aumenta en 1 la frecuencia de la cara obtenida
	            resultados[cara - 1]++;
	        }

	        // Se recorren las 6 posiciones del arreglo
	        for (int posicion = 0; posicion < 6; posicion++) {

	            // Se muestra la frecuencia de cada cara
	            System.out.println("Cara " + (posicion + 1) + ": " + resultados[posicion]);
	        }
	    }
	}

}
