package snpp;
import java.util.Scanner;
public class tst1 {
    public static void main(String[] args) {
        //El famoso Hola MUNDO
        System.out.println("Hola mundo");
        //declaramos variables
        int suma, b;
        int a=5;
        //Para usar scanner debemos importar java.util.Scanner
        Scanner reader= new Scanner(System.in);
        //le decimos al usuario que dijiste un numero para b
        System.out.println("Digite un número para b: ");
        b=reader.nextInt();
        //Realizamos la suma y lo mostramos en pantalla
        suma=a+b;
        System.out.println("El resultado es: \t" + suma);
    }
    
}
