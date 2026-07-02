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
public class Cuenta_Regresiva {
     public static void main(String[] args) {
    int cuenta;
    Scanner regreción=new Scanner (System.in);
    
System.out.println("Ingrese el numero desde el que desea que inicie la cuenta regresiva");
         cuenta=regreción.nextInt();
while (cuenta> 0) {
    System.out.println("Inicio de cuenta");
  System.out.println(cuenta);
  cuenta--;
}

System.out.println("Feliz año nuevo");
    
}
}