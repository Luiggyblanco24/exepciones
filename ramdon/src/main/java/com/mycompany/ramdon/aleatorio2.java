package com.mycompany.ramdon;

import java.util.InputMismatchException;
import java.util.Random;

public class aleatorio2 {
public static void main(String[] args) {
    Random random = new Random();
    int vidas = 7;
    
    while(vidas>0){
        try{
            for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(10) + 1;
            System.out.println( numero);

            if (numero % 2 == 0) {
                throw new InputMismatchException("Número par encontrado: " + numero);  
            }
           
        }
    } catch (InputMismatchException ex){
            System.err.println(ex.getMessage());
           
            System.out.println("Tienes " + (vidas-1) + " vidas restantes.");
             vidas--;
            
         }}
    System.out.println("te quedaste sin vidas, fin del game");
    
}}
