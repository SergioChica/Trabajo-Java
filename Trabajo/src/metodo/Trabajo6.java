package metodo;

import javax.swing.JOptionPane;

public class Trabajo6 {
	int tama�o;
	String nombre;
	
	public Trabajo6() {
		main(null);
		leerArreglo(tama�o, nombre);
	}

    public void main(String[] args) {
        int tama�o = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tama�o de los arreglos:"));

        int[] numeros1 = leerArreglo(tama�o, "primer");
        int[] numeros2 = leerArreglo(tama�o, "segundo");

        int sumaTotal = sumarArreglos(numeros1, numeros2);
        mostrarResultado(sumaTotal);
    }

    public int[] leerArreglo(int tama�o, String nombre) {
        int[] numeros = new int[tama�o];

            for (int i = 0; i < tama�o; i++) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero para el " + nombre + " arreglo"));
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
