package org.zabalburu.colegio.model;

public class Nota {
    private Modulo modulo;
    private double nota;
    public Nota(Modulo modulo, double nota) {
        this.modulo = modulo;
        this.nota = nota;
    }
    public Nota() {
    }
    public Modulo getModulo() {
        return modulo;
    }
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "Nota [modulo=" + modulo + ", nota=" + nota + "]";
    }

    
    
}