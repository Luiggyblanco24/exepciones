package com.mycompany.herencia.animal;

public class Cat extends Animals {
    private String color;

    public Cat(String color, String gender, String specie, int size, String name) {
        super(gender, specie, size, name);
        this.color = color;
    }
   
    
    public void play(){
        System.out.println("soy un gato jugando");
    }
    
    @Override
    public void talk(){
        System.out.println("emite maullido");
    }
    
}
