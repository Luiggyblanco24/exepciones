
package com.mycompany.ramdon;

import java.util.InputMismatchException;
import java.util.Random;


public class aleatorio {

    public static void main(String[] args) {
     
        Random random = new Random();
            
            try {
            for (int i = 0; i < 10; i++) {
                int numero = random.nextInt() + 1;
                System.out.println("Número aleatorio " + (i+1) + ": " + numero);
                if (numero % 2 != 0) {
                    throw new InputMismatchException("Número impar encontrado: " + numero);
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }}}
    
