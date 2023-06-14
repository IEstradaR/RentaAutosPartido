/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentaautosiquiquecs;

import Controllers.ControlFaltas;
import Controllers.Controller;
import Models.Amonestacion;
import Models.ModelUser;
import Models.QueriesFalta;
import Models.QueriesUser;
import Views.AmonestacionJ;
import Views.RentaJ;
import java.util.ArrayList;

/**
 *
 * @author SALA-306
 */
public class RentaAutosIquiqueCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Amonestacion modelo = new Amonestacion();
        AmonestacionJ vista = new AmonestacionJ();
        QueriesFalta sql = new QueriesFalta();
        ControlFaltas controlador = new ControlFaltas(vista, modelo, sql );
        vista.setVisible(true);
        
        
        /*ModelUser model = new ModelUser();
        RentaJ rentj = new RentaJ();
        QueriesUser queries = new QueriesUser();
        Controller control = new Controller(rentj, model, queries);
        rentj.setVisible(true);*/
        // TODO code application logic here
        /*Vehiculo auto = new Vehiculo("PRZX98", "CHERY", 16000, "Azul", "2021", 0, true);
        Vehiculo auto2 = new Vehiculo("KRK098", "HONDA", 1000, "Rojo", "2021", 0, true);
        ArrayList <Vehiculo>autos = new ArrayList<>();
        autos.add(auto);
        autos.add(auto2);
        Renta rent = new Renta("1", "23-12-23", 50, autos);
        
        for (int i = 0; i < autos.size(); i++) {
            System.out.println("Color: "+autos.get(i).getColor());
            System.out.println("Marca: "+autos.get(i).getMarca());
            System.out.println("Modelo: "+autos.get(i).getModelo());
            System.out.println("Patente: "+autos.get(i).getPatente()+"\n");
            
        }
        */
    }
    
}

