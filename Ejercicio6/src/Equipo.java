/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Equipo {

    private String nombre;
    private Jugador jugador;

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getNombre() {
        return nombre;
    }
}
