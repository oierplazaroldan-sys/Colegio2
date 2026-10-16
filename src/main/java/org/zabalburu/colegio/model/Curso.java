/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.colegio.model;

/**
 *
 * @author ichueca
 */
public class Curso {
    private String nombreCorto;
    private String nombre;
    private String tutor;
    private int alumnos;
    
    public Curso(){
        
    }
    
    public Curso(String nombreCorto, String nombreLargo){
        this.nombreCorto = nombreCorto;
        this.nombre = nombreLargo;
    }

    public Curso(String nombreCorto, String nombre, String tutor, int alumnos) {
        this.nombreCorto = nombreCorto;
        this.nombre = nombre;
        this.tutor = tutor;
        this.alumnos = alumnos;
    }
    
    public void setNombreCorto(String nombreCorto){
        this.nombreCorto = nombreCorto;
    }
    
    public String getNombreCorto(){
        return this.nombreCorto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        if (alumnos > 0){
            this.alumnos = alumnos;
        }
    }

    public boolean getSuficienteMatricula(){
        /*if (this.alumnos > 12){
            return true;
        } else {
            return false;
        }*/
        /*
        if (this.alumnos > 12){
            return true;
        }
        return false;*/
        return (this.alumnos > 12);
    }
    
}