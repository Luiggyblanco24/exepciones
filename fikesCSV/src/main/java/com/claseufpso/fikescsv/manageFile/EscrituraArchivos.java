package com.claseufpso.fikescsv.manageFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraArchivos {

    private File file;
    private FileWriter writer;
    private PrintWriter print;

    public EscrituraArchivos(File file) {
        this.file = file;
    }

    public void añadoData(String data) throws IOException {
        try {
            writer = new FileWriter(file, true); // Abrir en modo de añadir
            print = new PrintWriter(writer);
            print.println(data);
        } catch (IOException e) {
        } finally {
            if (print != null) {
                print.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
