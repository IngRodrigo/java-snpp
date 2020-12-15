package snpp;
public class RectanguloApp1 {
    public static void main(String[] args) {
        //Objetos miembros
        Rectangulo rect1=new Rectangulo(10,20,40,80);
        Rectangulo rect2=new Rectangulo(40,80);
        Rectangulo rect3=new Rectangulo();
        
        int mediaArea=rect1.calcularArea();
        System.out.println("El area del rectangulo es: "+mediaArea);
        
        rect2.desplazar(10, 20);
        if(rect1.estaDentro(20, 30)){
            System.out.println("El punto esta dentro del rectangulo");
            
        }else{
            System.out.println("El punto esta fuera del rectangulo");
        }
    }
    
}
