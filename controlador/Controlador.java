package controlador;

import modelo.Mayor3Enteros;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener
{
    //--------------
    //Atributos
    //----------------

    private VentanaPrincipal venPrin;
    private Mayor3Enteros model;
    //-------------
    //Metodos
    //------------

    //metodo Constructor
    public Controlador(VentanaPrincipal pVenPrin, Mayor3Enteros pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.btHallarMayor.addActionListener(this);
        this.venPrin.miPanelOperaciones.btBorrar.addActionListener(this);
        this.venPrin.miPanelOperaciones.btSalir.addActionListener(this);
    }

    //metodo atencion eventos
    public void actionPerformed(ActionEvent ae)
    {
        //Identificar el comando generado (hallar Mayor, Borrar, Salir)
        String comando = ae.getActionCommand();

        if(comando.equals("hallarMayor"))
        {
        try
        
        {
            this.model.setX(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getTfX()));
            this.model.setY(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getTfY()));
            this.model.setZ(Integer.parseInt(this.venPrin.miPanelEntradaDatos.getTfZ()));

            this.model.hallarmayor();

            this.venPrin.miPanelResultados.mostrarResultados(this.model.getMayor());

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Datos Incorrectos. \nLos datos deben ser Enteros", "suma 3 enteros", JOptionPane.ERROR_MESSAGE);
        }
        }
        
        if(comando.equals("borrar"))
        {
            JOptionPane.showMessageDialog(null, "Los Datos seran borrados", "suma 3 enteros", JOptionPane.WARNING_MESSAGE);
            this.venPrin.miPanelEntradaDatos.borrar();
            this.venPrin.miPanelResultados.borrar();
        }
        if(comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(null, "El programa se cerrara", "suma 3 enteros", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}
