/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aula aula = new Aula();
        Estudiante estudiante1 = new Estudiante("Juan");
        Estudiante estudiante2 = new Estudiante("Ana");

        aula.agregarEstudiante(estudiante1);
        aula.agregarEstudiante(estudiante2);

        aula.mostrarEstudiantes();  // Imprime los nombres de los estudiantes
    }
}
