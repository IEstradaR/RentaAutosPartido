/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ceduc
 */
public class Conexion {
    
    private final String BD="partido";
    private final String URL="jdbc:mysql://localhost:3306/"+BD;
    private final String user="root";
    private final String password="";
    private final String driver="com.mysql.cj.jdbc.Driver";
    private Connection con;
    
    
    public Connection conectar()
    {
        try {
            Class.forName(driver);
            con = (Connection)DriverManager.getConnection(this.URL, this.user, this.password);
            System.out.println("SE CONECTO A BD "+BD);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("NO SE CONECTO A BD "+BD);
        }
        return con;
    }
    
    public void desconectar()
    {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        Conexion cn = new Conexion();
        cn.conectar();
    }
    
    
}
