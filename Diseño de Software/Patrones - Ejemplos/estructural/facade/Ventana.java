package estructural.facade;

import javax.swing.*;

public class Ventana {
    //ATRIBUTOS
    private JFrame frame;

    //CONSTRUCTOR
    public Ventana(String titulo, int ancho, int alto){
        this.frame = new JFrame();
        this.frame.setTitle(titulo);
        this.frame.setBounds(0, 0, ancho, alto);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Iniciar la ventana
    public void iniciar(){
        this.frame.getContentPane().setLayout(null);
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);
    }
}