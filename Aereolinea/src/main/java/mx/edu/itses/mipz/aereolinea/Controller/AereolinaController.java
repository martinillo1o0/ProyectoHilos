/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.mipz.aereolinea.Controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import mx.edu.itses.mipz.aereolinea.Hilos.VuelosHilos;
import mx.edu.itses.mipz.aereolinea.Model.Gestion;
import mx.edu.itses.mipz.aereolinea.View.AereolineaView;


/**
 *
 * @author marti
 */
public class AereolinaController {
    private static Gestion model;
    private static AereolineaView view;

    public AereolinaController(Gestion model, AereolineaView view) {
        this.model = model;
        this.view = view;
    }

    public void TablaAereoLinea(){
        view.TablaAereoLinea(model);
     
    }
    public static void createFly(){
        view.createFly(model.getOrder());
        
         VuelosHilos p = new VuelosHilos();

        new Thread( () -> {
            for(int i = 0; i < 8; i++){
                p.vuelosDisponibles("Vueloº: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread( () -> {
            for(int i = 0 ; i < 12; i++){
                p.consumir();
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
     
    }

    public static void readFly() {
        view.readFly(model);
    }

    public static void deleteFly() {
        
      int respuesta =JOptionPane.showConfirmDialog(null, "Estas seguro de basear el modelo??");
          System.out.println(respuesta);
          if(respuesta==0){
              model.emptyModel();
              
          }
          view.deleteFly(model);
    }

    public static void updateFly() {
        view.getTableRow(model);
        view.updateFly(model);
    }
    public static  void saveFly(String nombre, String origen, String destino, LocalDate fechaLlegada, LocalTime horaLlegada, int cantidadPasajeros){
        model.setNombre(nombre);
        model.setOrigen(origen);
        model.setDestino(destino);
        model.setFechaLlegada(fechaLlegada);
        model.setHoraLlegada(horaLlegada);
        model.setCantidadPasajeros(cantidadPasajeros);
        
       view.updateTable(model);
    }
    
    
    private static HashMap<String, Gestion> vuelosMap = new HashMap<>();

  
    public static void agregarVuelo(Gestion vuelo) {
        vuelosMap.put(vuelo.getNombre(), vuelo);
    }
    public static Gestion buscarVuelo(String nombre) {
        return vuelosMap.get(nombre); 
    }
  
    public static void  showFly(){
        String Vuelo = "Nombre: " +model.getNombre()+"Origen del vuelo: "+model.getOrigen()+"Destino del vuelo: "+model.getDestino()+"Fecha de llegada: "+model.getFechaLlegada()+"Hora de llegada: "+model.getHoraLlegada()+"Cantidad de pasajeros: "+model.getCantidadPasajeros();
    }
    
    public void  insertIndex(){   
    }
    
}
