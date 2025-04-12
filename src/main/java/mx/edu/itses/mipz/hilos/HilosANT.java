/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.mipz.hilos;

import Model.AlfanumericoTarea;

/**
 *
 * @author marti
 */
public class HilosANT {
    public static void main(String[] args) {
        
        AlfanumericoTarea tarea1 = new AlfanumericoTarea(Tipo.NUMERO);
        AlfanumericoTarea tarea2 = new AlfanumericoTarea(Tipo.LETRA);
        AlfanumericoTarea tarea3 = new AlfanumericoTarea(Tipo.NUMERO);
        AlfanumericoTarea tarea4 = new AlfanumericoTarea(Tipo.LETRA);

       
        Thread hilo1 = new Thread(tarea1, "Hilo-1");
        Thread hilo2 = new Thread(tarea2, "Hilo-2");
        Thread hilo3 = new Thread(tarea3, "Hilo-3");
        Thread hilo4 = new Thread(tarea4, "Hilo-4");

     
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();  
     }
}
