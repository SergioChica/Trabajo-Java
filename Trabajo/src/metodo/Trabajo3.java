package metodo;
import java.util.Random;

public class Trabajo3 {
	
	public Trabajo3() {
		numeroAleatorio(); 
	}
	
	public int numeroAleatorio() {
		Random rand = new Random();
		
		int numAleatorio = rand.nextInt(100) + 1;
		
		System.out.println("El numero aleatorio es: "+numAleatorio);
		
		return numAleatorio;
	}

}