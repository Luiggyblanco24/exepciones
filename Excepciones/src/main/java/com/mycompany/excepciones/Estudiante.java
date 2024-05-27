package com.mycompany.excepciones;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombres;
    private String apellidos;
    private String codigoParticipacion;
    private List<Actividad> actividades;

    public Estudiante(String nombres, String apellidos, String codigoParticipacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigoParticipacion = codigoParticipacion;
        this.actividades = new ArrayList<>();
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCodigoParticipacion() {
        return codigoParticipacion;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }

    @Override
    public String toString() {
        return nombres + " " + apellidos + " (" + codigoParticipacion + ")";
    }
}


