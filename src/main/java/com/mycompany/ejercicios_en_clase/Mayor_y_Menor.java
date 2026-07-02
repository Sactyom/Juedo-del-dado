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
public class Mayor_y_Menor {
     public static void main(String[] args) {
         int total, mayor=0, menor=0;
         Scanner numero=new Scanner (System.in);
         System.out.println("Saludos, este es un programa que determina el numero mayor y el menor de entre una lista de numeros (enteros)");
        System.out.println("Ingrese la cantidad de numeros que conformaran la lista y los numeros de dicha lista");
        total=numero.nextInt();
        int lista[]=new int[total];
        for (int i=0;i<total;i++){
        System.out.print((i+1)+" Termino:");
        lista[i]=numero.nextInt();
        }
        for (int comparacion:lista){
            menor=comparacion;
            mayor=comparacion;
        }
        for(int pequeño:lista){
        if (menor>pequeño){
        menor=pequeño;
        }
        }
        for(int grande:lista){
        if (mayor<grande){
        mayor=grande;
        }
        }
System.out.println("El numero mayor es: " + mayor);
System.out.println("El numero menor es: " + menor);
     }
}
