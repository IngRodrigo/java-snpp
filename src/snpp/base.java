package snpp;
public class base {
int datoBase;
public base(){
    System.out.println("Dentro del constructor de la clase base");
    System.out.println("Asignado a datoBase 100");
    datoBase=100;
    
}

}
class ejemploSuper extends base{
    int datoSubClase;
    //Constructor de la subclase,
    public ejemploSuper(){
        //llamada al construsctor de la clase Base
        super();
        System.out.println("Dentro de la la subclase");
        System.out.println("Asignamos a datoSubClase 200");
        datoSubClase=200;
    }
    //Metodo para mostrar como se resuelve una ambiguedad entre una variale de local
    //y una variable de instancia que tiene el mimso nombre
    void miMetodo(){
        //se crea una variable local para ocultar la variable de instancia de la clase base
        int datoBase=300;
        System.out.println("Dentro de mi metodo");
        System.out.println("El valor de la variable local es: "+datoBase);
        System.out.println("El valor de la varibale de instancia: "+super.datoBase);
    }
    public static void main(String[] args) {
        ejemploSuper obj= new ejemploSuper();
        System.out.println("Dentro de main");
        System.out.println("La variable de instancia en la calse contiene: " +obj.datoBase);
        System.out.println("La variable de instancia de la subclase contiene: "+obj.datoSubClase);
        //llamada del metodo para mostar el uso de super en la resolucion de la ambiguedad
        obj.miMetodo();
    }
}
