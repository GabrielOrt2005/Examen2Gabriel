/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelexamenn;

import javax.swing.JOptionPane;

/**
 *
 * @author gaort
 */
public class Hotelexamenn {

    
    public static void main(String[] args) {
        
        registroHabitacion habi = new registroHabitacion();
        habi.info(habi.arrHabi);
        JOptionPane.showMessageDialog(null, habi.arrHabi);
        habi.modificar();
        
        
    }
    
}
