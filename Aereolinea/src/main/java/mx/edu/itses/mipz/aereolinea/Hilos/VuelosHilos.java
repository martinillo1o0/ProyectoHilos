package mx.edu.itses.mipz.aereolinea.Hilos;

import mx.edu.itses.mipz.aereolinea.Model.Gestion;
import mx.edu.itses.mipz.aereolinea.View.AereolineaView;

public class VuelosHilos {
    private static Gestion model;
    private String pan;
    private boolean disponible;
    
    

    public synchronized void vuelosDisponibles (String vuelo){
        while(disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        vuelo =  this.pan;
        System.out.println("Vuelo estimado: " + this.model);
        this.disponible = true;
        notify();
    }

    public synchronized String consumir(){
        while(!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cliente consume: " + this.model);
        this.disponible = false;
        notify();
        return pan;
    }
}
//ola