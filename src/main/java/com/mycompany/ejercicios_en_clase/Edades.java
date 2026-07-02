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
public class Edades {
    public static void main(String[] args) {
        Scanner fechas= new Scanner (System.in);
        int edad;
        System.out.println("Saludos, este es un programa de calculo de promedio de edades y analisis de edad menor");
        System.out.println("Ingrese la cantidad de edades que desea calcular");
        edad=fechas.nextInt();
        int edades[] = new int[edad];
        // An array storing different ages
        for (int i=0;i<edad;i++){
            System.out.print("Edad Nro"+(i+1)+":");
            edades[i]=fechas.nextInt();
        }
       
float promedio, suma = 0;
 int menor=0;

// Get the length of the array
int length = edades.length;

// Loop through the elements of the array
for (int Edad : edades) {
     menor=Edad;
  
  suma += Edad;
  
}
for (int Calculo:edades){
  if (menor>Calculo){
  menor=Calculo;
  }
}

// Calculate the average by dividing the sum by the length
promedio = suma / length;

// Print the average
System.out.println("El promedio de edades es de: " + promedio);

System.out.println("La edad menor entre todas las edades es: "+menor);
    }
}
