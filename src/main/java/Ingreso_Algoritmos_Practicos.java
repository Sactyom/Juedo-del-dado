/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;
public class Ingreso_Algoritmos_Practicos {
    public static void main(String[] args) {
        int X,M,columnas,Ep;
        String Z;
        Scanner Registro=new Scanner (System.in);
        do{
           System.out.println("Saludos, este es un sistema de registro para un numero indefinido de personas, por favor elija la cantidad de personas que desea registrar");
           columnas=Registro.nextInt();
           Registro.nextLine();
           String Datos[][]=new String [columnas][4];
              for(int i=0;i<columnas;i++){
            System.out.println("Ingrese al paciente Nro "+(i+1));
         System.out.println("Ingrese el numero de cedula del registrado");
             Datos[i][0]=Registro.nextLine();
             while(Datos[i][0].length()!=10){
                 if(Datos[i][0].length()!=10){
             System.out.println("Ingrese correctamente el numero de cedula");
             Datos[i][0]=Registro.nextLine();}
                 else
                     break;
             }
             System.out.println("Ingrese el apellido del registrado");
             Datos[i][1]=Registro.nextLine();
             
             System.out.println("Ingrese el nombre del registrado");
             Datos[i][2]=Registro.nextLine();
             System.out.println("Ingrese el numero de telefono del registrado");
             Datos[i][3]=Registro.nextLine();
              while(Datos[i][3].length()!=10){
                 if(Datos[i][3].length()!=10){
             System.out.println("Ingrese correctamente el numero de telefono");
             Datos[i][3]=Registro.nextLine();}
                 else
                     break;
             }
     }     
                   do{
                       System.out.println("Elija una de las opciones\n1)Mostrar pacientes\n2)Buscar un paciente");
           
             M=Registro.nextInt();
             Registro.nextLine();
            while(M<1||M>2){
                if(M<1||M>2){
            System.out.println("Ingresar solo los numeros pedidos");
            M=Registro.nextInt();
                }
                else
                    break;
            }
            
            switch (M){
                
             case 1:{
//             System.out.println("Lista de pacientes");
System.out.println("Lista de pacientes");
             for(int i=0;i<columnas;i++){
                System.out.println("Paciente Nro"+(i+1)+":");
             System.out.println("Nombre: "+Datos[i][2]);
             System.out.println("Apellido: "+Datos[i][1]);
//             System.out.println("Numero de cedula: "+Datos[i][0]);
System.out.println("Cedula"+Datos[i][0]);
             System.out.println("Numero de telefono: "+Datos[i][3]);
             }
             break;
             }
             case 2:{
                 System.out.println("Ingrese el numero de ceudla de un paciente ya registrado");
                 Z=Registro.nextLine();
                 for(int i=0;i<columnas;i++){
                     if(Z.equals(Datos[i][0])){
                System.out.println("Paciente Nro"+(i+1)+":");
             System.out.println("Nombre: "+Datos[i][2]);
             System.out.println("Apellido: "+Datos[i][1]);
             System.out.println("Numero de cedula: "+Datos[i][0]);
             System.out.println("Numero de telefono: "+Datos[i][3]);
              break;
                     }
                     else if(!Z.equals(Datos[i][0])&&(columnas-1)==i){
                     System.out.println("Paciente no registrado");
                     }
             }
             break;
             } 
            }
                   System.out.println("Desea seguir navegando por el menu?\nSi=Cualquier numero\nNo=0");
                   Ep=Registro.nextInt();
                   }while(Ep!=0);
             
            System.out.println("Desea seguir usando el programa?\nSi=Cualquier numero\nNo=0");
        X=Registro.nextInt();
        } while (X!=0);
    }
}
