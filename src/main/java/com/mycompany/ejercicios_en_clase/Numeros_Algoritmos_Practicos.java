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
public class Numeros_Algoritmos_Practicos {
    public static void main(String[] args) {
        int Mayor=0;
        Scanner Valores=new Scanner (System.in);
        int conjunto[]=new int[5];
        System.out.println("Saludos, este es un programa que lee 5 numeros y determina el numero mayor y su posision");
        System.out.println("Por favor, ingrese 5 valores");
        for (int i=0;i<5;i++){
            conjunto[i]=Valores.nextInt();
        }
        for (int i=0;i<5;i++){
           if (Mayor<=conjunto[i]){
               Mayor=conjunto[i];
           }
        }
        for (int i=0;i<5;i++){
            if (conjunto[i]==Mayor){
            System.out.println("El numero mayor es "+Mayor+" en la posicion "+ (i+1));
            }
        }
    }
    
}
