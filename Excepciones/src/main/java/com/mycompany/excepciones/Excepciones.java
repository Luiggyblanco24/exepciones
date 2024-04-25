package com.mycompany.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean inputIsValid = false;

        while (!inputIsValid) {
            try {
                System.out.println("Ingrese un valor entero:");
                number = scanner.nextInt();
                inputIsValid = true;

            } catch (InputMismatchException ex) {
                System.err.println("Debe ingresar valores numéricos");
                scanner.nextLine();
            }
        }
        int square = number * number;
        System.out.println("El cuadrado de " + number + " es " + square);
    }}
    
