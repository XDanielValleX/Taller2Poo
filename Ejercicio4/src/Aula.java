
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Aula {

    private List<Estudiante> estudiantes;

    public Aula() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println("Estudiante: " + e.getNombre());
        }
    }
}
