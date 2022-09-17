package vista;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{

    //-------------
    //Atributos
    //------------

    private JTextArea taResultado;
    private JScrollPane spresultados;
    //-------------
    //Metodos
    //------------


    //metodo Constructor
    public PanelResultados()
    {   
        //ContenedorDel panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Borde  y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.black);
        this.setBorder(borde);

        //Creacion y Adicion del area
        taResultado = new JTextArea();
        spresultados = new JScrollPane(taResultado);
        spresultados.setBounds(10, 15, 440, 280);
        add(spresultados);
    }

    //metodos acceso Informacion
    public void mostrarResultados(int mayor)
    {
        taResultado.setText("El numero Mayor es: " + mayor);
        //taResuktado,append("\nEl numero Mayor es: " + mayor);
    }

    //borrar
    public void borrar()
    {
        taResultado.setText("");
    }


}
