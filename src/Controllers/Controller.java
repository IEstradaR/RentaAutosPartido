/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.ModelUser;
import Models.QueriesUser;
import Views.RentaJ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Ceduc
 */
public class Controller implements ActionListener{
    
    private RentaJ ViewRenta;
    private ModelUser mdlRent;
    private QueriesUser mlusr;

    public Controller(RentaJ ViewRenta, ModelUser mdlRent, QueriesUser mlusr) {
        this.ViewRenta = ViewRenta;
        this.mdlRent = mdlRent;
        this.mlusr = mlusr;
        this.ViewRenta.btnGuardar.addActionListener(this);
    }

   
    
    public void iniciar()
    {
        ViewRenta.setTitle("Renta");
        ViewRenta.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==ViewRenta.btnGuardar) {
            
        }
        mdlRent.setUsuario(ViewRenta.txtLogin.getText());
        mdlRent.setPassword(ViewRenta.txtPass.getText());
        mdlRent.saludar();
        ViewRenta.txtSaludo.setText(mdlRent.getSaludo());
        
        if (mlusr.registrar(mdlRent))
        { 
            JOptionPane.showMessageDialog(null, "Registro guardado");
        }
        else{ 
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }
    
}
