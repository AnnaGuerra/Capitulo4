package cap4;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int num1,num2,num3,num4;
        int mayor;
        
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros");
        num1=intro.nextInt();
        num2=intro.nextInt();
        num3=intro.nextInt();
        num4=intro.nextInt();
        if ((num1>num2) && (num1>num3) &&(num1>num4));{
            mayor=num1;
        }
        if((num2>num1) && (num2>num3) && (num2>num4)){
                 mayor=num2;
        }
        if((num3>num1) && (num3>num2) && (num3>num4)){
                 mayor=num3;
        }       
        if((num4>num1) && (num4>num2) && (num4>num3)){
                 mayor=num4;
        }        
        System.out.println("El mayor es :"+mayor);
        
    }
    
}
