/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Amonestacion;
import Models.QueriesFalta;
import Views.AmonestacionJ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Starboy
 */
public class ControlFaltas implements ActionListener{
    
    private AmonestacionJ view;
    private Amonestacion mdlAmon;
    private QueriesFalta mdlFalta;

    public ControlFaltas(AmonestacionJ view, Amonestacion mdlAmon, QueriesFalta mdlFalta) {
        this.view = view;
        this.mdlAmon = mdlAmon;
        this.mdlFalta = mdlFalta;
        this.view.btnSavePlayer.addActionListener(this);
    }

    
    public void iniciar()
    {
        view.setTitle("VAR Partido");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==view.btnSavePlayer) {
            
        }
        mdlAmon.setFalta(view.txtFalta.getText());
        mdlAmon.setJugador(Integer.parseInt(view.txtJugador.getText()));
        mdlAmon.saludar();
        
        view.txtMensaje.setText(mdlAmon.getSaludo());
        
        if (mdlFalta.registrar(mdlAmon))
        { 
            JOptionPane.showMessageDialog(null, "Registro guardado");
        }
        else{ 
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }
    
}
    

