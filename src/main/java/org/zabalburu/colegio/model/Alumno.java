/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.colegio.model;

import java.util.Objects;
/**
 * La clase Alumno almacena la información de un alumno
 *
 * @author ichueca
 */
public class Alumno {

    private static int numAlumnos = 0;
    private int id;

    private String nombre;
    /**
     * Apellido del alumno
     */
    private String apellido;
    private int edad;
    private Nota notaPRO;
    private Nota notaBD;
    private Nota notaLM;
    private Nota notaED;
    private Nota notaSoste;
    private Nota notaDigi;
    private Nota notaIT;
    
    public static String getNotaTexto(int nota){
        String notaTexto;
        switch (nota){
            case 1:
            case 2:
            case 3:
            case 4:
                notaTexto = "IF";
            break;
            case 5:
                notaTexto = "SF";
            break;
            case 6:
                notaTexto = "BI";
            break;
            case 7:
            case 8:
                notaTexto = "MB";
            break;
            case 9:
            case 10:
                notaTexto="SB";
            break;
            default:
                notaTexto="No valid";
            break;
        }
        return notaTexto;
    }
    public Alumno(){
        this.id = ++Alumno.numAlumnos;
    }
    
    public Alumno(String nombre, String apellidos){
        this();
        /* this.id = ++Alumno.numAlumnos; */
        this.nombre = nombre;
        this.apellido = apellidos;
    }
    
    public Alumno(String nombre, String apellidos, int edad){
        this(nombre, apellidos);
        /*this.id = ++Alumno.numAlumnos;
        this.nombre = nombre;
        this.apellido = apellidos;*/
        this.edad = edad;
    }
    
    /*
    *    Setters / Getters
    */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public Nota getNotaPRO() {
        return notaPRO;
    }

    public void setNotaPRO(Nota notaPRO) {
        this.notaPRO = notaPRO;
    }

    public Nota getNotaBD() {
        return notaBD;
    }

    public void setNotaBD(Nota notaBD) {
        this.notaBD = notaBD;
    }

    public Nota getNotaLM() {
        return notaLM;
    }

    public void setNotaLM(Nota notaLM) {
        this.notaLM = notaLM;
    }

    public Nota getNotaED() {
        return notaED;
    }

    public void setNotaED(Nota notaED) {
        this.notaED = notaED;
    }

    public Nota getNotaSoste() {
        return notaSoste;
    }

    public void setNotaSoste(Nota notaSoste) {
        this.notaSoste = notaSoste;
    }

    public Nota getNotaDigi() {
        return notaDigi;
    }

    public void setNotaDigi(Nota notaDigi) {
        this.notaDigi = notaDigi;
    }

    public Nota getNotaIT() {
        return notaIT;
    }

    public void setNotaIT(Nota notaIT) {
        this.notaIT = notaIT;
    }

    /**
     * Calcula la nota media del alumno
     * 
     * @returns nota media del alumno como un double
     * 
     */
    public double getNotaMedia(){
        double sumaNotas = this.notaBD.getNota() + this.notaDigi.getNota()
            + this.notaED.getNota() + this.notaIT.getNota() +
            this.notaLM.getNota() + this.notaPRO.getNota()
            + this.notaSoste.getNota();
        return sumaNotas / 7;
    }

     public int getNumeroSuspensos(){
        int numSuspensos = 0;
        if (this.notaBD.getNota()<5){
            numSuspensos++;
        }
        if (this.notaDigi.getNota()<5){
            numSuspensos++;
        }
        if (this.notaED.getNota()<5){
            numSuspensos++;
        }
        if (this.notaIT.getNota()<5){
            numSuspensos++;
        }
        if (this.notaLM.getNota()<5){
            numSuspensos++;
        }
        if (this.notaPRO.getNota()<5){
            numSuspensos++;
        }
        if (this.notaSoste.getNota()<5){
            numSuspensos++;
        }
        return numSuspensos;
    }

    private int getHorasSuspendidas(){
        int horasSuspendidas = 0;
        if (this.notaBD.getNota()<5){
            horasSuspendidas = horasSuspendidas + this.notaBD.getModulo().getHoras();
        }
        if (this.notaDigi.getNota()<5){
           horasSuspendidas += this.notaDigi.getModulo().getHoras();
        }
        if (this.notaED.getNota()<5){
            horasSuspendidas += this.notaED.getModulo().getHoras();
        }
        if (this.notaIT.getNota()<5){
            horasSuspendidas += this.notaIT.getModulo().getHoras();
        }
        if (this.notaLM.getNota()<5){
            horasSuspendidas += this.notaLM.getModulo().getHoras();
        }
        if (this.notaPRO.getNota()<5){
            horasSuspendidas += this.notaPRO.getModulo().getHoras();
        }
        if (this.notaSoste.getNota()<5){
            horasSuspendidas += this.notaSoste.getModulo().getHoras();
        }
        return horasSuspendidas;
    }

    public boolean pasaCurso(){
        if (this.getHorasSuspendidas() <= 2 && this.getHorasSuspendidas() <=300){
            return true;
        } else{
            return false;
        }
        
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Alumno){
            Alumno otro = (Alumno) obj; // Lo trato como alumno
            if (this.nombre.equalsIgnoreCase(otro.nombre)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
