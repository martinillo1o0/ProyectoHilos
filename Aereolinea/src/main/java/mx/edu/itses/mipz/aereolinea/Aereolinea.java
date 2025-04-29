/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.mipz.aereolinea;

import mx.edu.itses.mipz.aereolinea.Model.Gestion;
import java.time.LocalDate;
import java.time.LocalTime;

import static java.util.Comparator.comparing;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import mx.edu.itses.mipz.aereolinea.Controller.AereolinaController;
import mx.edu.itses.mipz.aereolinea.Hilos.VuelosHilos;
import mx.edu.itses.mipz.aereolinea.View.AereolineaView;


/**
 *
 * @author marti
 */
public class Aereolinea {
 static Gestion model;
    static AereolineaView view;
    static AereolinaController controller;

    public static void main(String[] args) {
        model = new Gestion();
        view = new AereolineaView();
        controller = new AereolinaController(model,view);
        
        controller.TablaAereoLinea();

        
        
        
        
        
        

    }
}
