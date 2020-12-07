package snpp;
import java.util.Scanner;
public class CadenaDeCaracteres1 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nombre1, nombre2;
        int edad1, edad2;
        System.out.println("Ingrese el nombre: ");
        nombre1=teclado.next();
        System.out.println("Ingrese la edad: ");
        edad1=teclado.nextInt();
        System.out.println("Ingrese el nombre: ");
        nombre2=teclado.next();
        System.out.println("Ingrese la edad: ");
        edad2=teclado.nextInt();
        System.out.println("La persona menor es: ");
        if(edad1<edad2){
            System.out.println(nombre1);
        }else{
            System.out.println(nombre2);
        }
    }
}
