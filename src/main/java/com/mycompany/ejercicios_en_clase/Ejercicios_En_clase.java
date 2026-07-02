/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios_en_clase;

/**
 *
 * @author usuario
 */
import java.util.Scanner;
public class Ejercicios_En_clase {
  public static void main(String[] args) {
  int Fecha;
  Scanner Dia=new Scanner (System.in);
  
  System.out.println("Insert a number");
  Fecha=Dia.nextInt();
    switch (Fecha) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
}
