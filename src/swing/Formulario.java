package swing;

import javax.swing.JFrame;

public class Formulario extends JFrame{
    public Formulario(){
        setLayout(null);
        
    }
    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(10,20,400,300);
        formulario1.setVisible(true);
    }
}
