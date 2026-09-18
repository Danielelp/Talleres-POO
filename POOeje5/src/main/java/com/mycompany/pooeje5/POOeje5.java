package com.mycompany.pooeje5;
import java.util.Scanner;

public class POOeje5 {
    

    public static void main(String[] args) {
        double suma, x, y;
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Ingrese el valor de x ");
        x=scanner.nextDouble();
        
        System.out.println(" Ingrese el valor de suma ");
        suma=scanner.nextDouble();
        
        suma=Operaciones.operacio1(suma, x);
        
        System.out.println(" Ingrese el valor de y ");
        y=scanner.nextDouble();
        
        x=Operaciones.operacion2(x, y);
        suma=Operaciones.operacion3(suma, x, y);   
        System.out.println(" El valor de la suma: " + suma );
        
    }
}
