package com.claseufpso.fichero;

import java.io.File;

public class Fichero {

    public static void main(String[] args) {
       File file = new File ("c:/hola.txt");
       
        if (file.exists()) {
            System.out.println("nombre del archivo: " +file.getName());
            System.out.println("ruta del archivo: " +file.getPath());
            System.out.println("ruta absoluta: " +file.getAbsolutePath());
            System.out.println("se puede escribir?: " +file.canWrite());
            System.out.println("se puede leer? :" +file.canRead());
            System.out.println("tamaño: " +file.length());
        }
        else if (!file.exists()) {
            System.out.println("No existe");
        }
        
    }
}
