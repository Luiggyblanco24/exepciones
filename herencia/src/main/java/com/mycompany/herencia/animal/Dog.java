package com.mycompany.herencia.animal;

public class Dog extends Animals {
    
    private String fur;

    public Dog(String fur, String gender, String specie, int size, String name) {
        super(gender, specie, size, name);
        this.fur = fur;
    }
    
    public void sniff(){
        System.out.println("soy un perro olfateador");
    }
    
    @Override
    public void talk(){
        System.out.println("wau wau wau");
    }
    
    
    
}
