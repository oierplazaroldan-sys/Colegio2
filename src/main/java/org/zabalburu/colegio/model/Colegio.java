/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.colegio.model;



/**
 *
 * @author ichueca
 */
public class Colegio {
    public static final String CENTRO = "Zabalburu Ikastetexea, S.Coop.";
    public static final String NIF = "F46121763";
    
    public static void main(String[] args) {
        
        // Crear los módulos
        Modulo moduloPRO = new Modulo("Programación", "PRO", 264, "Iñigo Chueca");
        Modulo moduloBD = new Modulo("Base de Datos", "BD", 198, "Marta Torre");
        Modulo moduloLM = new Modulo("Lenguaje de Marcas", "LM", 132, "Argeme Vila");
        Modulo moduloED = new Modulo("Entornos de Desarrollo", "ED", 99, "Marta Torre");
        Modulo moduloSoste = new Modulo("Sostenibilidad", "SOSTE", 30, "Eder Gómez");
        Modulo moduloDigi = new Modulo("Digitalización", "DIGI", 60, "Eder Gómez");
        Modulo moduloIT = new Modulo("Inglés Técnico", "IT", 60, "Katie Mitchel");

        // Crear el curso
        Curso daw1 = new Curso("DAW1", "Desarrollo de Aplicaciones Web 1º","Marta Torre", 19);

        // Crear alumnos
        Alumno alum1 = new Alumno("Juan", "López Simón", 19);
        alum1.setNotaBD(new Nota(moduloBD, 7));
        alum1.setNotaDigi(new Nota(moduloDigi, 8));
        alum1.setNotaED(new Nota(moduloED, 5));
        alum1.setNotaIT(new Nota(moduloIT, 10));
        alum1.setNotaLM(new Nota(moduloLM, 6));
        alum1.setNotaPRO(new Nota(moduloPRO, 3));
        alum1.setNotaSoste(new Nota(moduloSoste, 4));
        
        System.out.println(
            """
            Alumno : %s %s
            Nota %-5s - %-25s (%-15s) : %5.2f
            Nota %-5s - %-25s (%-15s) : %5.2f
            Nota %-5s - %-25s (%-15s) : %5.2f
            Nota %-5s - %-25s (%-15s) : %5.2f
            Nota %-5s - %-25s (%-15s) : %5.2f
            Nota %-5s - %-25s (%-15s) : %5.2f
            Nota %-5s - %-25s (%-15s) : %5.2f

            Nota MEDIA : %5.2f %s
            """.formatted(
                alum1.getNombre(),
                alum1.getApellido(),
                alum1.getNotaBD().getModulo().getNombreCorto(),
                alum1.getNotaBD().getModulo().getNombre(),
                alum1.getNotaBD().getModulo().getImparte(),
                alum1.getNotaBD().getNota(),
                alum1.getNotaDigi().getModulo().getNombreCorto(),
                alum1.getNotaDigi().getModulo().getNombre(),
                alum1.getNotaDigi().getModulo().getImparte(),
                alum1.getNotaDigi().getNota(),
                alum1.getNotaED().getModulo().getNombreCorto(),
                alum1.getNotaED().getModulo().getNombre(),
                alum1.getNotaED().getModulo().getImparte(),
                alum1.getNotaED().getNota(),
                alum1.getNotaIT().getModulo().getNombreCorto(),
                alum1.getNotaIT().getModulo().getNombre(),
                alum1.getNotaIT().getModulo().getImparte(),
                alum1.getNotaIT().getNota(),
                alum1.getNotaLM().getModulo().getNombreCorto(),
                alum1.getNotaLM().getModulo().getNombre(),
                alum1.getNotaLM().getModulo().getImparte(),
                alum1.getNotaLM().getNota(),
                alum1.getNotaPRO().getModulo().getNombreCorto(),
                alum1.getNotaPRO().getModulo().getNombre(),
                alum1.getNotaPRO().getModulo().getImparte(),
                alum1.getNotaPRO().getNota(),
                alum1.getNotaSoste().getModulo().getNombreCorto(),
                alum1.getNotaSoste().getModulo().getNombre(),
                alum1.getNotaSoste().getModulo().getImparte(),
                alum1.getNotaSoste().getNota(),
                alum1.getNotaMedia(),
                Alumno.getNotaTexto((int) (alum1.getNotaMedia()))
            )
        );
        System.out.println("""
                Alumno: %s 
                %s de curso
                """.formatted(alum1.getNombre(),(alum1.pasaCurso())?"Pasa":"No pasa"));
            
            
        
    }
}
