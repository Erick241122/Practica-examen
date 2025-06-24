/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamenuno;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PracticaExamenUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String lectura;
        int actividades;
        lectura = JOptionPane.showInputDialog("Digite la cantidad de actividades realizadas");
        actividades = (Integer.parseInt(lectura));
       
            
        for (int i = 0; i < actividades; i++) {
            
        
        Empleado user = new Empleado();
        user.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
        user.setId(JOptionPane.showInputDialog("Digite su cedula: "));
        user.setCompania(JOptionPane.showInputDialog("Para que compañia labora?: "));
        user.setCodigo(JOptionPane.showInputDialog("Digite el codigo del viaje"));
        user.setTurno(JOptionPane.showInputDialog("En que horario desempeño sus labores"));
        user.setInternacional(JOptionPane.showInputDialog("Este es un viaje internacional?: "));
        String distancia = JOptionPane.showInputDialog("Cuanta fue la distacia recorrida?: ");
        user.setDistancia(Double.parseDouble(distancia));
        user.setCarga(JOptionPane.showInputDialog("Que tipo de carga llevo?: "));
        String fecha = JOptionPane.showInputDialog("Digite el numero del mes en que realizo el viaje");
        user.setFecha(Integer.parseInt(fecha));
        

        JOptionPane.showMessageDialog(null, user.toString());
        
       
                
        
        }
    }

}
