package com.mycompany.excepciones;

import java.util.ArrayList;
import java.util.List;

public class Actividad {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Actividad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public int getCantidadEstudiantes() {
        return estudiantes.size();
    }

    @Override
    public String toString() {
        return nombre;
    }
}




