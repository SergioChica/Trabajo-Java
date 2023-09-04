package metodo;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Trabajo8 {

    public Trabajo8() {
        registro(null);
    }

    public void registro(String[] args) {
        HashMap<String, Double> notasEstudiantes = new HashMap<>();
       
            String menu = "REGISTRO DE NOTAS\n\n";
        menu += "1. Agregar estudiante y nota\n";
        menu += "2. Consultar nota de estudiante\n";
        menu += "3. Salir\n\n";
        menu += "Elija una opción:";
        
        int opciones = 0;
                   
        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog(menu));
        	
            switch (opciones) {
            case 1:
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante: "));
                notasEstudiantes.put(nombre, nota);
                JOptionPane.showMessageDialog(null, "Nota registrada exitosamente.");
                break;
            case 2:
                String consultaNombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                if (notasEstudiantes.containsKey(consultaNombre)) {
                    double consultaNota = notasEstudiantes.get(consultaNombre);
                    JOptionPane.showMessageDialog(null, "La nota de " + consultaNombre + " es: " + consultaNota);
                } else {
                    JOptionPane.showMessageDialog(null, "El estudiante no está registrado.");
                }
                break;
            case 3:
                return; 
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
            
		} while (opciones != 3);
   }
}