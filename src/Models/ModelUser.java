/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Models;

/**
 *
 * @author Ceduc
 */
public class ModelUser {

    private String usuario;
    private String password;
    private String saludo;

    public ModelUser() {
    }

    public ModelUser(String usuario, String password, String saludo) {
        this.usuario = usuario;
        this.password = password;
        this.saludo = saludo;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String saludar()
    {
        this.saludo="Hola "+this.usuario+" Bienvenido al Sistema";
        return this.saludo;
    }
    
}
