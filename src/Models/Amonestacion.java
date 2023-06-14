/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Starboy
 */
public class Amonestacion {
    
    private int id;
    private String falta;
    private int jugador;
    private String saludo;

    public Amonestacion() {
    }

    public Amonestacion(int id, String falta, int jugador) {
        this.id = id;
        this.falta = falta;
        this.jugador = jugador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFalta() {
        return falta;
    }

    public void setFalta(String falta) {
        this.falta = falta;
    }

    public int getJugador() {
        return jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
      
    
    public String saludar()
    {
        this.saludo="El jugador "+this.jugador+" ha sido Expulsado";
        return this.saludo;
    }
    
    
}
