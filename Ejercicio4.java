package cap4;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int hrsTrabajadas;
        int hrsExtras;
        int pagoHrsExtras = 0;
        int grado;
        int sueldoBase = 0;
        int isapre, AFP;
        float des1 = 0, des2 = 0;
        double sueldo;
        
        Scanner intro= new Scanner (System.in);
        System.out.println("Ingrese cantidad de horas trabajadas");
        hrsTrabajadas=intro.nextInt();
        hrsExtras=hrsTrabajadas-40;
        if ((hrsExtras>=1) && (hrsExtras<=3))
            pagoHrsExtras=(hrsExtras*2000);
        else if ((hrsExtras>=4) && (hrsExtras<=7))
            pagoHrsExtras=(hrsExtras*3000);
        else if (hrsExtras>7)
            pagoHrsExtras=(hrsExtras*3500);
        
        System.out.println("Ingrese grado (1, 2 o 3)");
        grado=intro.nextInt();
        if (grado==1)
            sueldoBase=450000;
        else if (grado==2)
            sueldoBase=500000;
        else if (grado==3)
            sueldoBase=700000;
        
        System.out.println("Ingrese el numero de isapre");
        System.out.println("1. Colmena");
        System.out.println("2. Ban médica");
        System.out.println("3. Vida 3");
        System.out.println("4. Fonasa");
        isapre=intro.nextInt();
        if (isapre==1)
            des1=0.065F;
        else if (isapre==2)
            des1=0.073F;
        else if (isapre==3)
            des1=0.07F;
        else if (isapre==4)
            des1=0.07F;
        
        System.out.println("Ingrese el numero de AFP");
        System.out.println("1. BanSantander");
        System.out.println("2. Geometrica SA");
        System.out.println("3. Cuprum");
        System.out.println("4. Provida");
        AFP=intro.nextInt();
        if (AFP==1)
            des2=0.12F;
        else if (AFP==2)
            des2=0.134F;
        else if (AFP==3)
            des2=0.123F;
        else if (AFP==4)
            des2=0.129F;        
        
        sueldo=((sueldoBase+pagoHrsExtras)-((sueldoBase+pagoHrsExtras)*(des1+des2)));    
        System.out.println("El sueldo es: "+sueldo); 
                
                
    }
    
}
