package ArchivoPlano;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Archivo {
     public static void main(String[] args) throws IOException {
         
         try{
            File file = new File ("./archivo.txt");
         
             if (file.createNewFile()) {
                 System.out.println("Archivo creado con exito");   
             }else{
                 System.out.println("El archivo ya existe");
             }     
             FileReader reader = new FileReader(file, Charset.forName("UTF8"));
             
             System.out.println(reader.getEncoding());
             //mostrar o leer un archivo caracter a caracter (ARRAY)
             //char[]readed = new char[50];
             //reader.read(readed);
             //System.out.println(readed);
             
             //mostrar linea por linea
             BufferedReader buffer = new BufferedReader(reader);
             String line;
             while((line = buffer.readLine()) != null)
                 System.out.println("line: " + line);
             
         }catch(IOException e){
             //taratamiento adecuado
             
         }
     }
}
