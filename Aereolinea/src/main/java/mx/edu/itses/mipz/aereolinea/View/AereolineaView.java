/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.mipz.aereolinea.View;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import mx.edu.itses.mipz.aereolinea.Controller.AereolinaController;
import mx.edu.itses.mipz.aereolinea.Model.Gestion;

/**
 *
 * @author marti
 */
public class AereolineaView {
  private static Gestion model;
    private static TablaAereoLinea vistaAreolinea;
    //////////////////////////////////////////////////

    public void TablaAereoLinea(Gestion model) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vistaAreolinea = new TablaAereoLinea(model);
                vistaAreolinea.setVisible(true);

            }
        });
    }
    
    public void createFly(String order[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new RegistradorVuelos(order).setVisible(true);

            }
        });
    }
    public static void saveFly(String nombre, String origen, String destino, String fechaTexto, String horaTexto, String cantidadTexto) {
        DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        LocalDate fechaVuelo = LocalDate.parse(fechaTexto, fechaFormatter);
        
        DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaVuelo = LocalTime.parse(horaTexto, horaFormatter);

        int cantidadPasajeros = Integer.parseInt(cantidadTexto);
        
        AereolinaController.saveFly(nombre, origen, destino, fechaVuelo, horaVuelo, cantidadPasajeros);

   
}

    public void readFly(Gestion model) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lectorDeVuelo(model).setVisible(true);

            }
        });
    }

    public static void deleteFly(Gestion model) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new EliminadorDeVuelo(model).setVisible(true);

            }
        });

    }

    public static void updateFly(Gestion model) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new ActualizadorDeVuelo(model).setVisible(true);

            }
        });

    }
    
    
     public static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void updateTable(Gestion model){
       vistaAreolinea.updateTabla(model);
    }
    public void getTableRow(Gestion model){
      vistaAreolinea.getTableRow(model);
}

}
