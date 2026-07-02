/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_en_clase;

/**
 *
 * @author usuario
 */
import java.util.Scanner;
public class Asientos_de_cine {
     public static void main(String[] args) {
         Scanner valor=new Scanner (System.in);
         System.out.println("Saludos, este es un programa que determina el numero de asientos que serán ocupados por los clientes");
        System.out.println("Ingrese la cantidad de asientos que seran ocupados");
        int asientos;
        asientos=valor.nextInt();
        String compra[]=new String[asientos];
        System.out.println("Ingrese los nombres de los asientos correspondientes");
        for(int i=0;i<asientos;i++){
        System.out.print("Asiento Nro"+(i+1)+": ");
        compra[i]=valor.next();
        }
        


     }
    
}
