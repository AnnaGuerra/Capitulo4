package cap4;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        float nota;
        
        Scanner intro= new Scanner(System.in);
        System.out.println("Ingrese nota");
        nota=intro.nextInt();
        if ((nota>=1.0) && (nota<=3.9)){
            System.out.println("Insuficiente");
        } else if ((nota>=4.0) && (nota<=4.9)){
            System.out.println("Suficiente");
        } else if ((nota>=5.0) && (nota<=5.9)){
            System.out.println("Bien");
        } else if ((nota>=6.0) && (nota<=7.0)){
            System.out.println("Muy bien");
        }else {
            System.out.println("Nota Incorrecta");
        }
    }
    
}
