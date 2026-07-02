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
public class Matriz_3X3_Algoritmos_Practicos {
     public static void main(String[] args) {
         Scanner Matriz=new Scanner (System.in);
         int Menor=999999999;
         System.out.println("Programa de analisis de una matriz de 3X3");
         int K[][]=new int[3][3];
         for(int i=0;i<3;i++){
            System.out.println("Escriba los valores de la columna "+(i+1));
         for (int j=0;j<3;++j){
         K[i][j]=Matriz.nextInt();
         }
     }
        for(int i=0;i<3;i++){
            System.out.print("Columna "+(i+1)+" ");
         for (int j=0;j<3;++j){
         System.out.print(K[i][j]+"/");
         }
      System.out.println("");
     } 
        for(int i=0;i<3;i++){
         for (int j=0;j<3;++j){
         if(Menor>K[i][j]){
         Menor=K[i][j];
         }
         }
     } 
        for(int i=0;i<3;i++){
         for (int j=0;j<3;++j){
         if(Menor==K[i][j]){
         System.out.print("El numero menor entre todos los de la matriz es "+Menor+" en la posicion "+(j+1)+" (Fila), "+(i+1)+" (Columna)");
         }
         }
     } 
     }
}
