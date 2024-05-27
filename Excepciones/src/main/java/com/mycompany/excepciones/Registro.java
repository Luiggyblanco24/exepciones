
package com.mycompany.excepciones;

import java.io.*;
import java.util.*;

public class Registro {
    private Map<String, Estudiante> estudiantes;
    private Map<String, Actividad> actividades;
    private Random random;

    public Registro() {
        estudiantes = new HashMap<>();
        actividades = new HashMap<>();
        random = new Random();
    }

    public String generarCodigoParticipacion(String nombres, String apellidos) {
        String iniciales = nombres.charAt(0) + "" + nombres.charAt(1) + apellidos.charAt(0) + apellidos.charAt(1);
        String codigo;
        do {
            int numero = random.nextInt(1000);
            codigo = iniciales.toLowerCase() + numero;
        } while (estudiantes.containsKey(codigo));
        return codigo;
    }

    public void registrarEstudiante(String nombres, String apellidos, String actividadNombre) throws Exception {
        String codigoParticipacion = generarCodigoParticipacion(nombres, apellidos);
        Estudiante estudiante = new Estudiante(nombres, apellidos, codigoParticipacion);
        
        if (estudiantes.containsKey(codigoParticipacion)) {
            estudiante = estudiantes.get(codigoParticipacion);
            if (!estudiante.getActividades().contains(new Actividad(actividadNombre))) {
                estudiante.agregarActividad(new Actividad(actividadNombre));
            } else {
                throw new Exception("El estudiante ya está registrado en esta actividad");
            }
        } else {
            estudiante.agregarActividad(new Actividad(actividadNombre));
            estudiantes.put(codigoParticipacion, estudiante);
        }
        
        if (!actividades.containsKey(actividadNombre)) {
            actividades.put(actividadNombre, new Actividad(actividadNombre));
        }
        
        actividades.get(actividadNombre).agregarEstudiante(estudiante);
    }

    public void listarEstudiantesPorActividad() {
        for (String nombreActividad : actividades.keySet()) {
            Actividad actividad = actividades.get(nombreActividad);
            System.out.println("Actividad: " + nombreActividad);
            System.out.println("Estudiantes: ");
            for (Estudiante estudiante : actividad.getEstudiantes()) {
                System.out.println(estudiante);
            }
            System.out.println("Total de estudiantes: " + actividad.getCantidadEstudiantes());
        }
    }

    public void guardarDatos() throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
            out.writeObject(estudiantes);
            out.writeObject(actividades);
        }
    }

    public void cargarDatos() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
            estudiantes = (Map<String, Estudiante>) in.readObject();
            actividades = (Map<String, Actividad>) in.readObject();
        }
    }

    public static void main(String[] args) {
        Registro registro = new Registro();
        try {
            registro.registrarEstudiante("Juan", "Perez", "Matemáticas");
            registro.registrarEstudiante("Maria", "Lopez", "Física");
            registro.registrarEstudiante("Juan", "Perez", "Física");
            registro.registrarEstudiante("miguel","lopez","Matemáticas");

            registro.listarEstudiantesPorActividad();

            registro.guardarDatos();
            registro.cargarDatos();

            registro.listarEstudiantesPorActividad();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}