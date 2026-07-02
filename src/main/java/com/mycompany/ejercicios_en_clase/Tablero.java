/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_en_clase;

/**
 *
 * @author usuario
 */


public class Tablero {
    static void Tablero1() {
        char conjunto[][]=new char[8][8];
        for(int i=0;i<8;i++){
         for (int j=0;j<8;j++){
         conjunto[i][j]='.';
         }
         }
  conjunto [0][0]='T';
  conjunto [0][1]='H';
  conjunto [0][2]='B';
  conjunto [0][3]='Q';
  conjunto [0][4]='K';
  conjunto [0][5]='B';
  conjunto [0][6]='H';
  conjunto [0][7]='T'; 
for(int i=0;i<8;i++){
         for (int j=0;j<8;j++){
         conjunto[1][j]='P';
         }
         }
  
  conjunto [7][0]='t';
  conjunto [7][1]='h';
  conjunto [7][2]='b';
  conjunto [7][3]='q';
  conjunto [7][4]='k';
  conjunto [7][5]='b';
  conjunto [7][6]='h';
  conjunto [7][7]='t';
  for(int i=0;i<8;i++){
         for (int j=0;j<8;j++){
         conjunto[6][j]='p';
         }
         }
  for(int i=0;i<8;i++){
      System.out.print((i+1));
         for (int j=0;j<8;j++){
         System.out.print(conjunto[i][j]+" ");
         }
         System.out.println("");
         }
  System.out.println(" a b c d e f g h");
  System.out.println();
    }
    public static void main(String[] args) {
    Tablero1();
    }
    
}
