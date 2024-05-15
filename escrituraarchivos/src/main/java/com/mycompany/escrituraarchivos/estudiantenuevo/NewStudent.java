package com.mycompany.escrituraarchivos.estudiantenuevo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class NewStudent {

    public static void main(String[] args) throws IOException {
        File file = null ;
        FileWriter writer = null ;
        PrintWriter print ;
        try {
            file = new File("./escrituraarray.txt");
            writer = new FileWriter(file);
            print = new PrintWriter(writer);
            String[][] names = new String[3][2];
            for (int i = 0; i < names.length; i++) {
                print.println("Luiggy " + names[0][0] +" sebastian " + names[0][0]  );
                print.println("Luiggy " + names[1][1] +" sebastian " + names[1][1] );
                print.println("Luiggy " + names[2][2] +" sebastian " + names[2][2] );
                
            }
        } catch (Exception e) {
        } finally {
            
                if (file != null) {
                    writer.close();
               
            } 
        }
    }
}
