/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion59906;
import java.util.Scanner;
/** 
 *
 * @author carri
 */
public class Ejercicio1Seleccion59906 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in); 
       
        // TODO code application logic here
        //Elabore un programa que lea tres números enteros e imprima el mayor de ellos.
      int nu1 = 0;
      int nu2 = 0;
      int nu3 = 0;
      
      System.out.println ("introduce tu primer numero");
      nu1 = sc.nextInt ();
      
      System.out.println ("introduce tu segundo numero");
      nu2 = sc.nextInt();
      
      System.out.println ("introduce un ultimo numero");
      nu3 = sc.nextInt();
      
      if (nu1>nu2){
            if (nu1>nu3){
                 System.out.println ("El numero mayor es: " + nu1);
            } else {
                System.out.println(" El numero mayor es:" + nu3);
            }
      } else if (nu2>3){ 
          System.out.println(" El numero mayor es:" + nu2);
      }  else {
          System.out.println("el numero mayor es:" + nu3); 
}