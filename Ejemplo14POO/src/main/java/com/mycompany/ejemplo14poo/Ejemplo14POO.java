
package com.mycompany.ejemplo14poo;
import java.util.Scanner;
public class Ejemplo14POO {

    
    public static double calcularCuadrado(double numero) {
        return numero * numero;
    }

    public static double calcularCubo(double numero) {
        return numero * numero * numero;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = sc.nextDouble();

        double cuadrado = calcularCuadrado(numero);
        double cubo = calcularCubo(numero);

        System.out.println("El cuadrado es: " + cuadrado);
        System.out.println("El cubo es: " + cubo);

        sc.close();
    }
}