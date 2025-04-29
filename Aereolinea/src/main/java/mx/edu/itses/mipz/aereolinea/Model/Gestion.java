/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.mipz.aereolinea.Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;



/**
 *
 * @author marti
 */
public class Gestion {
    private String nombre;
    private String origen;
    private String destino;
    private LocalDate fechaLlegada;
    private LocalTime horaLlegada;
    private int cantidadPasajeros;

    public Gestion() {
        this.nombre = "";
        this.origen = "";
        this.destino = "";
        this.fechaLlegada = null;
        this.horaLlegada = null;
        this.cantidadPasajeros = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(LocalTime horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
    public String []getOrder(){
        String order[]= {"Ordenar por fecha de llegada","Ordenar por hora de llegada","Ordenar por numero de pasajeros"};
        return order;
    }
    
    public void emptyModel(){
        
   
        this.nombre = "";
        this.origen = "";
        this.destino = "";
        this.fechaLlegada = null;
        this.horaLlegada =null;
        this.cantidadPasajeros = 0;
    }
}
