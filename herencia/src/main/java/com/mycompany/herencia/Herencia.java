package com.mycompany.herencia;

import com.mycompany.herencia.animal.Animals;
import com.mycompany.herencia.animal.Cat;
import com.mycompany.herencia.animal.Dog;

public class Herencia {

    public static void main(String[] args) {
        
        Animals animal = new Animals("desconocida","macho",50,"generico");
        
        Cat cat = new Cat("amarillo","mamiferos","hembra",25,"gato");
        
        Dog dog = new Dog("corto", "mamifero", "macho", 50, "perro");
        
        animal.talk();
        cat.talk();
        dog.talk();
        dog.sniff();
        
    }
}
