
package com.mycompany.ejemplo12poo;
public class Ejemplo12POO {
 
    public static double calcularSalarioBruto(double horasTrabajadas, double valorHora) {
        return horasTrabajadas * valorHora;
    }
    public static double calcularValorRetefuente(double porcentajeRetefuente, double salarioBruto) {
        return porcentajeRetefuente * salarioBruto;
    }
    public static double calcularSalarioNeto(double salarioBruto, double valorRetefuente) {
        return salarioBruto - valorRetefuente;
    } 
    public static void main(String[] args) {
        
        
        double horasTrabajadas = 48.0;
        double valorHora = 5000.0;
        double retencion = 12.5;
        double porcentajeRetefuente = retencion / 100.0;
        double salarioBruto = calcularSalarioBruto(horasTrabajadas, valorHora);
        double valorRetefuente = calcularValorRetefuente(porcentajeRetefuente, salarioBruto);
        double salarioNeto = calcularSalarioNeto(salarioBruto, valorRetefuente);
        
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Retención en la Fuente: " + valorRetefuente);
        System.out.println("Salario Neto: " + salarioNeto);
    }
}