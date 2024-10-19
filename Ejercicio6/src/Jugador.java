/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Jugador {

    private String nombre;
    private Equipo equipo;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }
}
