package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Modelo de la clase Curso
 * 
 * @Id @param codcurso
 * @param nombre
 * @param duracion
 * @param precio
 * 
 */
@Entity
@Table(name="cursos2")
public class Curso {

    @Id
    private int codcurso;
    private String nombre;
    private int duracion;
    private int precio;

    public Curso() {
    }
    public Curso(int codcurso, String nombre, int duracion, int precio) {
        this.codcurso = codcurso;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }
    
    public int getCodCurso() {
        return codcurso;
    }
    public void setCodCurso(int codcurso) {
        this.codcurso = codcurso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}
