package snpp;
public class ejemplothis {
//variable instancia
    int miVariable;
    //Cosntructor de la clase
    public ejemplothis(){
        miVariable=5;
    }
    //metodo con argumentos
    void miMetodo(int miVariable){
            System.out.println("La variable miVariable contiene: "+miVariable);
            System.out.println("La variable instancia miVariable contiene: "+this.miVariable);
    }
    
    public static void main(String[] args) {
        //instanciamos el objeto del tipo de clase
        ejemplothis obj=new ejemplothis();
        //que utilizaremos para llamar al unico metodo
        obj.miMetodo(10);
    }
}
