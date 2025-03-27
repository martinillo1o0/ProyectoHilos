/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.mipz.hilos;

import Model.ThreadSimple;

/**
 *
 * @author marti
 */
public class Hilos {
    
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new ThreadSimple("Jose");
        hilo.start();
        Thread hilo2 = new ThreadSimple("Juan");
        hilo2.start();
        System.out.println(hilo.getState());

    }
}
