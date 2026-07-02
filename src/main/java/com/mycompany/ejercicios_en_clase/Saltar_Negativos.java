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
public class Saltar_Negativos {
     public static void main(String[] args) {
         Scanner Lista=new Scanner (System.in);
         int Listado,j=0;
         System.out.println("Saludos, este es un programa que analisa una lista de numeros (solo enteros), saltando los negativos y terminando cuando detecta un 0 en la lista");
        System.out.println("Ingrese la cantidad de numeros que conformaran la lista y los numeros de dicha lista");
         Listado=Lista.nextInt();
         int numeros[]=new int[Listado];
         for(int i=0;i<Listado;i++){
     System.out.print((i+1)+" Termino:");
     numeros[i]=Lista.nextInt();
     }
       

for (int n : numeros) {
  if (n < 0) {
    continue; // skip negative numbers
  }
  if (n == 0) {
    break; // stop loop when zero is found
  }
  j++;
  System.out.println(j+". "+n);
 
}

     }
    
}
