package snpp;
//importamos lo necesario
import java.util.Scanner;
public class tst2 {
    //metodo principal
    public static void main(String[] args) {
        int tabla;
        //le decimos al usuario lo que la aplicacion hace
        System.out.println("Puedo mostrarte cualquier tabla de multiplicar");
        System.out.println("Dime cual quieres verificar : ");
        Scanner dato = new Scanner(System.in);
        tabla = dato.nextInt();
        //formateamos titulo de la tabla
        System.out.println("Esta es la tabla del: " + tabla);
        System.out.println("*****************************");
        for (int i = 1; i <= 12; i++) {//tabla hasta multiplciar por 12
            System.out.println(tabla + "x" + i + " = " + (tabla * i));
        }
        //uso del if
        int test = 20;//cambie a 20
        if (test == 20) {
            System.out.println("Test vale :" + test);//concatene con la variable
        } else {
            System.out.println("Test es distinto de 20");
        }
        //uso del while
        int x = 0;
        while (x != 10) {
            x++;
            System.out.println("Vuelta: " + x);
        }
        //Uso del switch
        switch (x) {
            case 10:
                System.out.println("10!!");
                break;
            default:
                System.out.println("Distinto de 10");
                break;
        }
        x=0;
        //uso del Do while
        do{
            System.out.println("Numero: "+x);
        x++;
        }while(x!=10);
                //definicion de array
                int [] array={1,2};
                //uso for
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Son elementos del array");//agregue mensaje
                    System.out.println("array[i] = " + array[i]);
                }
    }

}
