package com.mycompany.excepciones;

import java.util.Random;

public class numeroRandom {

      Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(Integer.MAX_VALUE); // Generar un número aleatorio entre 0 y el máximo valor de un entero
            System.out.println("Número aleatorio " + (i+1) + ": " + numero);
        }
    }
}
