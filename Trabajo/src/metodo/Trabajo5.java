package metodo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Trabajo5 {

    ArrayList<Integer> numeros = new ArrayList<Integer>();


    public Trabajo5() {
        arreglos();
    }

    public int encontrarMaximo(ArrayList<Integer> lista) {
        int maximo = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > maximo) {
                maximo = lista.get(i);
            }
        }
        return maximo;
    }

    public void arreglos() {
        String resp = "";

        do {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero"));
            numeros.add(numero);

            resp = JOptionPane.showInputDialog("Ingrese 'si' para continuar");

        } while (resp.equalsIgnoreCase("si"));

        if (!numeros.isEmpty()) {
            int maximo = encontrarMaximo(numeros);
            JOptionPane.showMessageDialog(null, "El n�mero m�ximo ingresado es: " + maximo);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron n�meros para buscar el m�ximo",
                    "FIN", JOptionPane.WARNING_MESSAGE);
        }
    }
}