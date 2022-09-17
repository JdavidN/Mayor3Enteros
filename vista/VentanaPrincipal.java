package vista;

import javax.swing.JFrame;
public class VentanaPrincipal extends JFrame
{

    //--------------
    //Atributos
    //-----------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;


    //-------------
    //Metodos
    //------------

    //Metodo Constuctor
    public VentanaPrincipal()
    {   

        //Definicion contenedor de la ventana
        this.setLayout(null);
        

        //Creacion y edicion de un panel ripo PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10, 10, 465, 200);
        this.add(miPanelEntradaDatos);

        //Creacion y edicion de un panel ripo PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10, 220, 465, 60);
        this.add(miPanelOperaciones);

        //Creacion y edicion de un panel ripo PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10, 280, 465, 300);
        this.add(miPanelResultados);

        //caracterisiticas
        this.setTitle("Mayor de 3 enteros" );
        this.setSize(500, 650);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setVisible(true);

    }

    
}