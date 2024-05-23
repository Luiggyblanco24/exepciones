package com.mycompany.excepciones;

public class numeroRandom {

 public static double divide(double numerador, double denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return numerador / denominator;
    }
    
    public static double square(double number) {
        return number * number;
    }
    
    public static void main(String[] args) {
        try {
            double result1 = divide(4, 2);
            System.out.println("Resultado de la división: " + result1);
            
            double result2 = divide(4, 2); // Esto generará una excepción
            System.out.println("Resultado de la división: " + result2); // Esta línea no se ejecutará
        } catch (ArithmeticException e) {
            System.out.println("Error: " );
        } finally {
            System.out.println("Operación completa.");
        }
        
        double result3 = square(5);
        System.out.println("Resultado del cuadrado: " + result3);
    }
}





