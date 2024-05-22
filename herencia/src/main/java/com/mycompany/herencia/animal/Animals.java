package com.mycompany.herencia.animal;

public class Animals {
    private String gender;
    private String specie;
    private int size;
    private String name;

    public Animals(String gender, String specie, int size, String name) {
        this.gender = gender;
        this.specie = specie;
        this.size = size;
        this.name = name;
    }    
    
    public void talk(){
        System.out.println("say something");
    }
    
    
    
}
