package metodo;
import javax.swing.JOptionPane;

public class Trabajo2 {
	
	/*Realice un algoritmo que use un M�todo con par�metros y
	 *sin retorno que recibe un n�mero entero y lo imprime en
	 *pantalla si es mayor que 10:
	 * */
	
	int num;
	
	public Trabajo2() {
		num =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero")); 
		numeroMayor(num);
	}
	
	public void numeroMayor(int n1) {
		if (n1 > 10) {
			System.out.println("El numero: " + n1 + " Es mayor que 10");			
		}
	}

}