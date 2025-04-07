/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase4;

/**
 *
 * @author anaaw
 */
import java.util.Scanner;
public class Clase4 {
    
    public static void main(String[] args) {
        /*Scanner entrada = new Scanner (System.in);//instanciar
        String nombre = entrada.nextLine ();//Solo cadena
        System.out.println("Hola "+nombre+".");*/
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println(" Ingrese la opcion");
        int opcion;
        Scanner e = new Scanner (System.in);
        opcion= e.nextInt();
        int a;
        int b;
        
        System.out.println("Ingrese el primer numero");
        a= e.nextInt();
        System.out.println("Ingrese el segundo numero");
        b= e.nextInt();
     
        switch (opcion) {
            case 1:
                int suma = a+b;
               System.out.println("El resultado es "+suma);
                 break;
            case 2:
                int resta =a-b;
                System.out.println("El resultado es "+resta);
                break;
            case 3:
                int multiplicaion=a*b;
                System.out.println("El resultado es "+multiplicaion);
                break;
            default:
                System.out.println("error");
                throw new AssertionError();
        }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        /*int  []edades; //declarar primitivos
        edades =new int [4]; //instanciar
        float [] promedios; //declarar
        promedios =new float [10]; //instanciar
        promedios [3]=5.6;
        Persona [] persona;
        String [] nombres;
        nombres =new string [10];
        nombres [1]= "Jojanci";
        byte [] tipos;
        tipos =new byte [10];
        tipos [4]=5;
        Curso [] curso; //Declarar datos compuestos
        curso= new Curso [10]; //instanciar
        System.out.println("Hello World!");
       int [] pepitos;
       pepitos =new int [4];
       pepitos[0]= 1;
       pepitos [1] = 2;
       pepitos [2]= 7;
       pepitos [3]=10;
       int x=pepitos [2];
        int pepitos = {10,5,4,3,2}*/
        //MATRICES
        //int [][] pepitos;
        //pepitos= new int [3][3]; //fila*columna
        
