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
  //------variables pro1---------------
  public static int valor1;
  public static int valor2;
  //-----------------------------------
  public static String [] Va={"v1","v2","v3","v4","v5","v6","v7","v8"};
  public static int [] pesoVa={ 223,243,100,200,200,155,300,150};
  public static int [] producVa={30,34,28,45,31,50,29,1};
   
  
  
  
  
  
    public static void main(String[] args) {
       // System.out.println("hola mundo");
        MenuPrincipal();
    }
    public static void MenuPrincipal(){
       // System.out.println("hola2");
     Scanner escaner = new Scanner(System.in);
     Opcion=0;
    System.out.println("****** MENU PRINCIPAL *******");
    System.out.println("*  1. PROBLEMA 1                *");
    System.out.println("*  2. PROBLEMA 2                *");
    System.out.println("*  3. PROBLEMA 3                *");
    System.out.println("*****************************");
     Opcion = escaner.nextInt();
        
        if (Opcion==1) {
            
            System.out.println("problema1");
            problema1();
        }else{
            if (Opcion==2) {
                System.out.println("problema2");
                problema2();
            }else{
                if (Opcion==3) {
                    System.out.println("problema 3");
                    problema3();
                    
                }else{
                    System.out.println("intente de nuevo,");
                }
            }
        }
    }
    
    //---------------problema 1-------------------------------
    public static void problema1(){
        Scanner escaner = new Scanner(System.in);
        System.out.println("INGRESE EL PRIMER VALOR");
        valor1=escaner.nextInt();
        System.out.println("INGRESE EL SEGUNDO VALOR");
        valor2=escaner.nextInt();
    
        if (valor1>valor2) {
            System.out.println("EL VALOR MAYOR ES: "+valor1);
            
        }else{
            System.out.println("EL VALOR MAYOR ES: "+valor2);
        }
    }
    
    //---------------problema 2-------------------------------
     public static void problema2(){
         int base1 = 0;
         int base2;
         Scanner escaner = new Scanner(System.in);
         
         System.out.println("INGRESE EL VALOR DE LA BASE: ");
         base1=escaner.nextInt();
         
         
         if(base1 % 2 == 0) {
            System.out.println(base1+" es un número par, favor ingrese de nuevo");
        }else {
            
        base2=((base1-3)/2)+1;
         
          int r = base2+1, k = 0;

    for (int i = 1; i <= r; ++i, k = 0) {
      for (int j = 1; j <= r - i; ++j) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
        
             
        }

  }
     
     
    //---------------problema 3------------------------------
     
   public static void problema3(){
       System.out.println("Unos pedillos ( ˘︹˘ )");
       
   }
}
     
    

