package com.claseufpso.archivofichero;

import java.io.FileReader;
import java.io.IOException;

public class ArchivoFichero {

    public static void main(String[] args) throws IOException {
        //caracter a caracter
        String path = "./data.txt";
        FileReader fileReader= null;
        try{
            fileReader = new FileReader(path);
            int value = fileReader.read();
            while(value !=-1){
                System.out.print((char)value);
                value = fileReader.read();
            }
        }catch(IOException e){
            System.out.println("ha ocurrido u ");
        }finally{
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
