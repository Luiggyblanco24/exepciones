package com.mycompany.restauranttrycatch;

import Platos.Document;
import Platos.Platos;
import Platos.Seleccion;
import java.util.Arrays;
import java.util.Scanner;

public class RestaurantTryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Platos platos = new Platos();
        
        Document document = new Document();
        
        
        Seleccion seleccion = new Seleccion(platos.getPrecioPlato());
        
        document.guardarMenuYTotal(platos, seleccion);
        
        
        boolean continuar = true;

        while (continuar) {
            System.out.println("los platos que puede elegir son 1:" + Arrays.toString(platos.getPlato1()) + " 2:" + Arrays.toString(platos.getPlato2()) + " 3:" + Arrays.toString(platos.getPlato3()));

            System.out.println("Cual plato desea, oprima el numero correspondiente a las anteriores opciones: ");
            int eleccion = sc.nextInt();

            String platoSeleccionado = null;
            switch (eleccion) {

                case 1:
                    System.out.println("Su eleccion fue: " + Arrays.toString(platos.getPlato1()));
                    break;
                case 2:
                    System.out.println("su eleccion fue: " + Arrays.toString(platos.getPlato2()));
                    break;
                case 3:
                    System.out.println("su eleccion fue" + Arrays.toString(platos.getPlato3()));
                    break;

                default:
                    System.out.println("no se escuentra disponible esa opccion");
                    continue;
            }
            seleccion.agregarPlato(platoSeleccionado);

            System.out.println("desea elergio otro plato");
            System.out.println("si no lo desea oprima 0");
            int respuesta = sc.nextInt();
            if (respuesta == 0) {
                continuar = false;
            }
        }
        

        System.out.println("Platos seleccionados: " + seleccion.getPlatoSeleccionado());
        System.out.println("Total a pagar: " + seleccion.getTotal());

    }
}
