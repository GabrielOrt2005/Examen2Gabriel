/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelexamenn;

import javax.swing.JOptionPane;

public class Habitaciones {
    
    private int numeroH;
    private String TipoH;
    private int  precioH;
    private String estadoH;

    public Habitaciones(int numeroH, String tipoH, int precioH, String estadoH) {
        this.numeroH = numeroH;
        this.TipoH = tipoH;
        this.precioH = precioH;
        this.estadoH = estadoH;
    }

    @Override
    public String toString() {
        return "Habitaciones: " + "numero: " + numeroH + ", tipo: " + TipoH + ", precio: " + precioH + ", estado: " + estadoH ;
    }
    
    

    public int getNumeroH() {
        return numeroH;
    }

    public void setNumeroH(int numeroH) {
        this.numeroH = numeroH;
    }

    public String getTipoH() {
        return TipoH;
    }

    public void setTipoH(String tipoH) {
        this.TipoH = tipoH;
    }

    public int getPrecioH() {
        return precioH;
    }

    public void setPrecioH(int precioH) {
        this.precioH = precioH;
    }

    public String getEstadoH() {
        return estadoH;
    }

    public void setEstadoH(String estadoH) {
        this.estadoH = estadoH;
    }

   
    
    }

    
    
    
    
   



