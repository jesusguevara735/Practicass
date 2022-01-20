package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void caracterEn(String palabra, int numero) {
        // write your code here
        try{
            System.out.print("la letra en el numero "+numero+" es: "+palabra.charAt(numero));
        }catch(StringIndexOutOfBoundsException ex){
            System.out.println("Has intentado recuperar una posicion de la cadena de caracteres que no existe.");
            System.exit(1);
        }
    }
    public static void Practica1(String[] args) {
        int numero=0;
        Scanner leerteclado= new Scanner(System.in);
        System.out.println("inserte palabra: ");
        String palabra=leerteclado.next();
        try{
            System.out.println("inserte numero: ");
            numero=leerteclado.nextInt();
        }catch(InputMismatchException ex)  {
            System.out.println("Fallo: Debe introducir numero entero ");
            System.exit(2) ;
        }catch(NumberFormatException ex)   {
            System.out.println("Fallo: Debe introducir numero entero ");
            System.exit(3) ;
        }
        //String palabra=[1];
        //int entero=Integer.parseInt(args[0]);
        System.out.println("Palabra insertada : " +palabra+ " En el numero : "+numero);
        caracterEn(palabra, numero);
    }
}