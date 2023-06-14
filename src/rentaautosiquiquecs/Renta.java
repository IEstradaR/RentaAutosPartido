/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentaautosiquiquecs;

import java.util.ArrayList;

/**
 *
 * @author SALA-306
 */
public class Renta {
    
 private String ID;
 private String fecha;
 private double kmVehiculo;
 
 private ArrayList<Vehiculo> vehiculos;

    public Renta() {
    }

    public Renta(String ID, String fecha, double kmVehiculo, ArrayList<Vehiculo> vehiculos) {
        this.ID = ID;
        this.fecha = fecha;
        this.kmVehiculo = kmVehiculo;
        this.vehiculos = vehiculos;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getKmVehiculo() {
        return kmVehiculo;
    }

    public void setKmVehiculo(double kmVehiculo) {
        this.kmVehiculo = kmVehiculo;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
 
 
    
}
