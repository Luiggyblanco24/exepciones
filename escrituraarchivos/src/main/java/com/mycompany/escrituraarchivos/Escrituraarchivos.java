package com.mycompany.escrituraarchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Escrituraarchivos {

    public static void main(String[] args) {
        File file = null;
        FileWriter writer = null;
        PrintWriter print = null;
        try {
            file = new File("./archivo.txt");
            writer = new FileWriter(file);
            print = new PrintWriter(writer);
            for (int i = 0; i < 10; i++) {
                print.println("Linea " + i);
            }
        } catch (Exception e) {

        } finally {
            try {
                if (file != null) {
                    writer.close();
                }
            } catch (Exception e) {

            }
        }
    }
}
