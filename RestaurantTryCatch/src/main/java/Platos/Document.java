package Platos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Document {

    public void guardarMenuYTotal(Platos platos, Seleccion seleccion) {
        File fichero = null;
        FileWriter writer = null;
        PrintWriter pw = null;

        try {
            fichero = new File("./restaurante.txt");
            writer = new FileWriter(fichero);
            pw = new PrintWriter(writer);

            pw.println("los platos disponibles son");
            pw.println(Arrays.toString(platos.getPlato1()));
            pw.println(Arrays.toString(platos.getPlato2()));
            pw.println(Arrays.toString(platos.getPlato3()));
            pw.println("Total del pedido realizado: " + seleccion.getTotal());
            pw.println("platos pedidos: " + seleccion.getPlatoSeleccionado());

        } catch (IOException e) {
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
            }
        }
    }
}
