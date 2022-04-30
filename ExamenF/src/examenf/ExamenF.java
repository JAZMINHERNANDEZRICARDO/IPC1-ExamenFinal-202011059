/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenf;

import java.util.Scanner;

/**
 *
 * @author krist
 */
public class ExamenF {

  public static int Opcion;
  
    public static void main(String[] args) {
       // System.out.println("hola mundo");
        MenuPrincipal();
    }
    public static void MenuPrincipal(){
       // System.out.println("hola2");
     Scanner escaner = new Scanner(System.in);
     Opcion=0;
    System.out.println("****** MENU PRINCIPAL *******");
    System.out.println("*  1.                 *");
    System.out.println("*  2.                 *");
    System.out.println("*  3.                 *");
    System.out.println("*****************************");
     Opcion = escaner.nextInt();
        System.out.println(Opcion+"funciona");
        
        if (Opcion==1) {
            
            System.out.println("problema1");
        }else{
            if (Opcion==2) {
                System.out.println("problema2");
            }else{
                if (Opcion==3) {
                    System.out.println("problema 3");
                    
                }else{
                    System.out.println("intente de nuevo,");
                }
            }
        }
    }
    
}
