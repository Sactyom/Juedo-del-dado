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
public class Intercambio_de_vectores_Algoritmos_Practicos {
    public static void main(String[] args) {
        Scanner Ab=new Scanner (System.in);
        int N, S=0;
        System.out.println("Escriba el numero de valores que tendran los dos vectores");
        N=Ab.nextInt();
        int A[][]=new int [2][N];
        for(int i=0;i<2;i++){
            System.out.println("Escriba los valores del vector "+(i+1));
         for (int j=0;j<N;++j){
         A[i][j]=Ab.nextInt();
         }
     }
        System.out.println("Vectores originales");
        for(int i=0;i<2;i++){
            System.out.print("Vector "+(i+1)+" ");
         for (int j=0;j<N;++j){
         System.out.print(A[i][j]+"/");
         }
      System.out.println("");
     }
        System.out.println("Vectores Intercambiados-Invertidos");
       for(int i=2-1;i>=0;i--){
          S=S+1; 
            System.out.print("Vector "+S+" ");
         for (int j=N-1;j>=0;j--){
         System.out.print(A[i][j]+"/");
         }
      System.out.println("");
       } 
    }
    
}
