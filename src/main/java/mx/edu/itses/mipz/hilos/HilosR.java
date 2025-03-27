/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.edu.itses.mipz.hilos;

import Model.RunnableSimple;


/**
 *
 * @author marti
 */
public class HilosR {

    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();
        
        
        Runnable hilo =() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " "+ Thread.currentThread().getName());
                try{
                   Thread.sleep((long)(Math.random()*1000));
                }catch(Exception e){
                    System.out.println(e);
                }
                   System.out.println("Estado: " +Thread.currentThread().getState());
            }
            
    };
         Thread.currentThread().getState();///Estados
         
         
         System.out.println(Thread.currentThread().getName());
         
        Thread hilo1 = new Thread(hilo,"carrerra de Cabasho 1");
        Thread hilo2 = new Thread(hilo,"carrerra de Cabasho 2");
        Thread hilo3 = new Thread(hilo,"carrerra de Cabasho 3");
        Thread hilo4 = new Thread(hilo,"carrerra de Cabasho 4");
        Thread hilo5 = new Thread(hilo,"carrerra de Cabasho 5");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();


        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        hilo5.join();
        Thread.sleep(1000);
         System.out.println("Continuacion del main "+Thread.currentThread());
         
    }
}
