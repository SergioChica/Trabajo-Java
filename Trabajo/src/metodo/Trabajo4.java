package metodo;
import javax.swing.JOptionPane;

public class Trabajo4 {

    int numeros[] = new int[4];
    int cont = 0;

    public Trabajo4() {
    	arreglos();
    }

    public int encontrarMaximo(int[] arreglo) {
        int maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }

    public void arreglos() {
    	
        String resp = "";

        do {
            int array = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            numeros[cont] = array;

            cont++;

            if (cont < numeros.length) {
                resp = JOptionPane.showInputDialog("Ingrese 'si' para continuar");
            } else {
                JOptionPane.showMessageDialog(null, "Ya no hay espacio en el arreglo",
                        "FIN", JOptionPane.WARNING_MESSAGE);
                resp = "no";
            }

        } while (resp.equalsIgnoreCase("si"));
  

        if (cont > 0) {
            int maximo = encontrarMaximo(numeros);
            JOptionPane.showMessageDialog(null, "El número máximo ingresado es: " + maximo);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números para buscar el máximo",
                    "FIN", JOptionPane.WARNING_MESSAGE);
        }
    }

}
