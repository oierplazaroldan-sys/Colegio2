/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.colegio;

import org.zabalburu.colegio.model.Alumno;
import org.zabalburu.colegio.model.Curso;
/**
 *
 * @author DAW1
 */
public class Colegio {
    
    private static final String CENTRO = "Zabalburu Ikastetxea, S.Coop.";
    private static final String NTF = "F46121763";

    public static void main (String[] args) {
        
        System.out.println("""
                           ====================
                           %s
                           
                           NTF: %s
                           """.formatted(Colegio.CENTRO, Colegio.NTF));
        /*Alumno a1 = new Alumno(); 
        a1.nombre = "Oier";
        a1.apellidos = "Plaza Roldan";*/
        Alumno a1 = new Alumno ("Oier","Plaza");
        a1.setEdad(18);//edad = 18;
        a1.setNotaPRO1(8.9);//notaPRO1 = 8.9;
        a1.setNotaPRO2(9.7);//notaPRO2 = 9.7; 
        a1.setNotaPRO3(5.5);//notaPRO3 = 5.5;
        /*Alumno a2 = new Alumno();
        a1.notamedia ();
        a2.nombre = "Oier";
        a2.apellidos = "Plaza Roldan";
        a2.edad = 18;*/
        Alumno a2 = new Alumno ("Oier","Plaza", 18);
        a2.setNotaPRO1(18);//notaPRO1 = 8.9;
        a2.setNotaPRO2(9.7);//notaPRO2 = 9.7; 
        a2.setNotaPRO3(5.5);//notaPRO3 = 5.5;
        a2.notamedia ();
       /** 
        * System.out.println("Informacion del Alumno");
        System.out.println("======================");
        System.out.println("Nombre: " + a1.nombre);
        System.out.println("Apelllidos: " + a1.apellidos);
        System.out.println("Edad: " + a1.edad + " años");
        System.out.println("Nota1: " + a1.notaPRO1);  
        System.out.println("Nota2: " + a1.notaPRO2);
        System.out.println("Nota3: " + a1.notaPRO3);
        System.out.println("----------------------");
        System.out.println("Nota media: " + a1.notamedia());
        System.out.println("Nota media:  %.2f".formatted(a1.notamedia()));
        System.out.println("");*/
       Curso c1 = new Curso ();
           c1.setNombre_tiny("DAW");
           c1.setNombre_large("Desarrollo de Aplicaciones Web 1");
           c1.setTutor("Marta");
           c1.setNum_alumno(10);
       Alumno a3 = a1;
            System.out.println("""
                Informacion al Alumno
                =====================
                Nombre    : %s
                Apellido  : %s
                Edad      : %d años
                Nota PRO1 : %5.2f 
                Nota PRO2 : %5.2f 
                Nota PRO3 : %5.2f 
                ---------------------
                Nota media de %s es %.2f
                =====================
                Curso: %s - %s
                Tutor/a: %s
                El curso tiene %d alumnos
                El curso %s tiene suficiente matricula
                """.formatted(a1.getNombre(),
                    a1.getApellidos(),
                    a1.getEdad(),
                    a1.getNotaPRO1(),
                    a1.getNotaPRO2(),
                    a1.getNotaPRO3(),
                    a1.getNombre(),
                    a1.notamedia(),
                    c1.nombre_tiny(),
                    c1.nombre_large(),
                    c1.tutor(),
                    c1.num_alumno(),
                    (c1.getSuficientematricula())? "si":"no"));
   
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals("Oier"));       
        System.out.println(a1 == a3);       
    }
 /* if (getSuficienteMatricula){
      print ln "el curso tiene suficiente matricula"
    }
  else ´{"el curso no tiene"*/
   
}
