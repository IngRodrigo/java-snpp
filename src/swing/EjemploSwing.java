package swing;
//importamos lo necesario para usar swing

import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EjemploSwing {
    public static void main(String[] args) {
        //Invoca a las instancias y accesos de Swing/AWT hechas en Event
        //Dispatch Thread (Edit)
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //Crear un Frame, es un Windows con "decoraciones", o sea titulo, borde y boton
                JFrame f= new JFrame("Swing Example Windows");
                f.setLayout(new FlowLayout());
                //Accion de algunos componetes 
                f.add(new JLabel("Hello Word"));
                f.add(new JButton("Press me"));
                f.pack();
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setVisible(true);
                
            }
        });
    }
}
