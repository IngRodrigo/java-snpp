package snpp;

import java.util.Scanner;

public class CadenaDeCaracteres2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String apenom1, apenom2;
        int edad1, edad2;
        System.out.println("Ingrese un nombre y apellido: ");
        apenom1=teclado.nextLine();
        System.out.println("Ingrese una edad: ");
        edad1=teclado.nextInt();
        System.out.println("Ingrese un nombre y apellido: ");
        teclado.nextLine();
        apenom2=teclado.nextLine();
        System.out.println("Ingrese una edad: ");
        edad2=teclado.nextInt();
        System.out.println("La persona mayor es: ");
        if(edad1>edad2){
            System.out.println(apenom1);
        }else{
            System.out.println(apenom2);
        }
        
    }
}
