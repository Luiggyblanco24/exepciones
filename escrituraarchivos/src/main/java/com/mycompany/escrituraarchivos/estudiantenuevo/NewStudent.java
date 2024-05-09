package com.mycompany.escrituraarchivos.estudiantenuevo;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;


public class NewStudent {
  private File file = null;
  private FileWriter writer = null;
  private PrintWriter print = null;
  
  ReadFile readFile = new ReadFile(file);
  List<String> data = readFile.loadData();
  try{
      file = new File("./data.csv");
      writer = new FileWriter(data);
      print = new PrintWriter(writer);
            for (int i = 0; i < 4; i++) {
                System.out.println("luiggy " + i);
            }
    }
}
