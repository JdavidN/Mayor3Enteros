package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{

    //--------------
    //Atributos
    //-----------------
    private JLabel lbTitulo;
    private JLabel lbX;
    private JLabel lbY;
    private JLabel lbZ;
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JTextField tfX;
    private JTextField tfY;
    private JTextField tfZ;

    




    //-------------
    //Metodos
    //------------

    //Metodo COnstructor
    public PanelEntradaDatos()

    {
        //definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        // crear y agregar etiqueta para titulo
        lbTitulo = new JLabel("Mayor 3 Numeros", JLabel.CENTER);
        lbTitulo.setForeground(Color.black);
        lbTitulo.setFont(new Font("Arial", Font.BOLD,20));
        lbTitulo.setBounds(10, 10, 465 , 20);
        this.add(lbTitulo);

        //creacion y edicion de imagen a panel.
        iImagen= new ImageIcon(getClass().getResource("/vista/images.jpg"));
        lbImagen =new JLabel(iImagen);
        lbImagen.setBounds(310, 60 , 100, 100);
        this.add(lbImagen);

        //Etiqueta X
        lbX = new JLabel("X =");
        lbX.setForeground(Color.black);
        lbX.setFont(new Font("Arial", Font.BOLD,20));
        lbX.setBounds(30, 50, 465 , 20);
        this.add(lbX);

        //Campo de Texto X
        tfX = new JTextField();
        tfX.setForeground(Color.black);
        tfX.setFont(new Font("Arial", Font.BOLD,20));
        tfX.setBounds(60, 50, 120 , 20);
        this.add(tfX);

        //Etiqueta Y
        lbY = new JLabel("Y = ");
        lbY.setForeground(Color.black);
        lbY.setFont(new Font("Arial", Font.BOLD,20));
        lbY.setBounds(30, 100, 465 , 20);
        this.add(lbY);

        
         //Campo de Texto Y
        tfY = new JTextField();
        tfY.setForeground(Color.black);
        tfY.setFont(new Font("Arial", Font.BOLD,20));
        tfY.setBounds(60, 100, 120 , 20);
        this.add(tfY);
        

        //Etiqueta Z
        lbZ = new JLabel("Z =");
        lbZ.setForeground(Color.black);
        lbZ.setFont(new Font("Arial", Font.BOLD,20));
        lbZ.setBounds(30, 150, 465 , 20);
        this.add(lbZ);

        //Campo de Texto Z
        tfZ = new JTextField();
        tfZ.setForeground(Color.black);
        tfZ.setFont(new Font("Arial", Font.BOLD,20));
        tfZ.setBounds(60, 150, 120 , 20);
        this.add(tfZ);


        //Borde  y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.black);
        this.setBorder(borde);
    }

    //ACCESO A LA iNFORMACION
    public String getTfX()
    {
        return tfX.getText();
    }

    public String getTfY()
    {
        return tfY.getText();
    }

    public String getTfZ()
    {
        return tfZ.getText();
    }

    //Borrar caja de textos
    
    public void borrar()
        {
            tfX.setText("");
            tfY.setText("");
            tfZ.setText("");
        }
    
}

  