package com.claseufpso.fikescsv;

import com.claseufpso.fikescsv.manageFile.EscrituraArchivos;
import com.claseufpso.fikescsv.manageFile.ReadFile;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FikesCSV {

    public static void main(String[] args) throws IOException {
        File file = new File("./data.csv");

        ReadFile readFile = new ReadFile(file);
        List<String> data = readFile.loadData();
        for (String line : data) {
            String[] splited = new String[4];
            splited = line.split(";");
            System.out.println("Hola " + splited[0] + " " + splited[1] + " con codigo: " + splited[2] + " y numero de celular:  " + splited[3]);
        }

        String nuevoNombre = "luiggy";
        String nuevoApellido = "sebastian";
        String nuevoCodigo = "12345";
        String nuevoCelular = "3214848106";
        String nuevaLinea = nuevoNombre + ";" + nuevoApellido + ";" + nuevoCodigo + ";" + nuevoCelular;

        // Escribir el nuevo registro en el archivo
        EscrituraArchivos writeFile = new EscrituraArchivos(file);
        writeFile.añadoData(nuevaLinea);

        // Mostrar el mensaje en la consola
        System.out.println(" el nuevo estudiante " + nuevoNombre + " " + nuevoApellido + " con codigo " + nuevoCodigo + " y celular " + nuevoCelular);
    }
}
