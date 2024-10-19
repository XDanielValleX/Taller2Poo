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
        Jugador jugador = new Jugador("Lionel Messi");
        Equipo equipo = new Equipo("Paris Saint-Germain");

        jugador.setEquipo(equipo);
        equipo.setJugador(jugador);

        System.out.println(jugador.getNombre() + " juega en " + equipo.getNombre());

    }
}
