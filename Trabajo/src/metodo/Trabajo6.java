package metodo;

import javax.swing.JOptionPane;

public class Trabajo6 {
	int tamaño;
	String nombre;
	
	public Trabajo6() {
		main(null);
		leerArreglo(tamaño, nombre);
	}

    public void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de los arreglos:"));

        int[] numeros1 = leerArreglo(tamaño, "primer");
        int[] numeros2 = leerArreglo(tamaño, "segundo");

        int sumaTotal = sumarArreglos(numeros1, numeros2);
        mostrarResultado(sumaTotal);
    }

    public int[] leerArreglo(int tamaño, String nombre) {
        int[] numeros = new int[tamaño];

            for (int i = 0; i < tamaño; i++) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para el " + nombre + " arreglo"));
                numeros[i] = numero;
            }

        return numeros;
    }

    public int sumarArreglos(int[] arr1, int[] arr2) {
        int sumaTotal = 0;
        for (int i = 0; i < arr1.length; i++) {
            sumaTotal += arr1[i] + arr2[i];
        }
        return sumaTotal;
    }

    public static void mostrarResultado(int resultado) {
        System.out.println("La suma total de los dos arreglos es: " + resultado);
    }
}
