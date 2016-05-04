/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap4;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int dinero;
        int veintemil,diezmil,cincomil,dosmil,mil,quinientos,cien,cincuenta,diez,cinco,uno;
        
        Scanner intro = new Scanner(System.in);
        
        System.out.println("Ingrese dinero");
        dinero=intro.nextInt();
        veintemil=(int) (dinero/20000);
        diezmil=(int) ((dinero%20000)/10000);
        cincomil=(int) ((dinero%10000)/5000);
        dosmil=(int) ((dinero%5000)/2000);
        mil=(int) ((dinero%2000)/1000);
        quinientos=(int) ((dinero%1000)/500);
        cien=(int) ((dinero%500)/100);
        cincuenta=(int) ((dinero%100)/50);
        diez=(int) ((dinero%50)/10);
        cinco=(int) ((dinero%10)/5);
        uno=(int) (dinero%5);
        System.out.println(" Billetes de $20000: "+veintemil);
        System.out.println(" Billetes de $10000: "+diezmil);
        System.out.println(" Billetes de $5000: "+cincomil);
        System.out.println(" Billetes de $2000: "+veintemil);
        System.out.println(" Billetes de $1000: "+mil);
        System.out.println(" Monedas de $500: "+quinientos);
        System.out.println(" Monedas de $100: "+ cien);
        System.out.println(" Monedas de $50: "+cincuenta);
        System.out.println(" Monedas de $10: "+diez);
        System.out.println(" Monedas de $5: "+cinco);
        System.out.println(" Monedas de $1: "+uno);
    }
}
