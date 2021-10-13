/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dardo;

import java.util.Scanner;

/**
 *
 * @author ELITE BOOK
 */
public class Dardo {    
    private static Scanner sc;
    public static void main(String args[]) {
        double x=0,y=0,r=0,x2=0,y2=0,r2=0;
        sc = new Scanner(System.in);System.out.println("JUEGO DE DARDOS");
        System.out.println("Ingrese punto en X");x=sc.nextDouble();
        System.out.println("Ingrese punto en Y");y=sc.nextDouble();
        x2=Math.pow(x, 2);
        y2=Math.pow(y, 2);
        r2=x2+y2;
        r=Math.sqrt(r2);
        
        if(r<=1) {
            System.out.println("Su puntaje es 15 el dardo dio en el rojo");
        }else{
            if(r<=2){
                System.out.println("Su puntaje es de 9 el dardo dio en el naranja");
            }else{
                if(r<=3) {
                    System.out.println("Su puntaje es de 5 el dardo dio en el amarillo");
                }else{
                    if(r<=4) {System.out.println("Su puntaje es de 2 el dardo dio en el verde");
                    }else{
                        if(r<=5) {
                            System.out.println("Su puntaje es 1 el dardo dio en el azul");
                        }else {
                            System.out.println("Su puntaje es de 0 el dardo salio del tablero");}
                    }
                }
            }
        }
    }
}
   
