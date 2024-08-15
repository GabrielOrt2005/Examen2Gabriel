/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelexamenn;

import javax.swing.JOptionPane;

public class registroHabitacion {

    Habitaciones[][] arrHabi = new Habitaciones[3][3];

    public void info(Habitaciones[][] info) {
        for (int i = 0; i < 1; i++) {
            this.arrHabi[0][i] = new Habitaciones(211, "doble", 20000, "sucia");
        }

        for (int i = 0; i < 1; i++) {
            this.arrHabi[1][i] = new Habitaciones(321, "simple", 10000, "Limpia");

        
        
            this.arrHabi[2][i] = new Habitaciones(433, "doble", 20000, "Ocupada");

        }
    }    

    public void modificar() {
        int habitacionE = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la habitacion que desea modificar"));
        String tipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo de habitacion: ");
        int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio de la habitacion"));
        String estado = JOptionPane.showInputDialog("Ingrese el nuevo estado de la habitacion");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de la habitacion"));
        arrHabi[habitacionE][0].setTipoH(tipo);
        arrHabi[habitacionE][0].setPrecioH(precio);
        arrHabi[habitacionE][0].setEstadoH(estado);
        arrHabi[habitacionE][0].setNumeroH(numero);
        JOptionPane.showMessageDialog(null, arrHabi);
    
    }
}
