package org.zabalburu.colegio.model;

public class Modulo {
    private final int id;
    private final String nombre;
    private final String nombreCorto;
    private final int horas;
    private final String imparte;

    private static int numModulos = 0;
    
    public Modulo(String nombre, String nombreCorto, int horas, String imparte) {
        this.id = ++Modulo.numModulos;
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
        this.horas = horas;
        this.imparte = imparte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public int getHoras() {
        return horas;
    }

    public String getImparte() {
        return imparte;
    }

    @Override
    public String toString() {
        return "Modulo [nombre=" + nombre + ", nombreCorto=" + nombreCorto + ", horas=" + horas + ", imparte=" + imparte
                + "]";
    }

    


}
