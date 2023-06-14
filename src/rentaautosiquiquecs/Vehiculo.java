/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentaautosiquiquecs;

/**
 *
 * @author SALA-306
 */
public class Vehiculo {
   
private String patente;    
private String marca;
private int tipo;
private String color;
private String modelo;
private double km;
private boolean disponibilidad;

Renta rent;
    
    //Constructor sin parametros
    public Vehiculo()
    {
    }
    //constructor con parámetros
    public Vehiculo(String patente, String marca, int tipo, String color, String modelo, double km, boolean disponibilidad) {
        this.patente = patente;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.modelo = modelo;
        this.km = km;
        this.disponibilidad = disponibilidad;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    





}
