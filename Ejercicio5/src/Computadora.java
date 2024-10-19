/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Computadora {

    private Procesador procesador;

    public Computadora() {
        this.procesador = new Procesador();  // Computadora crea el procesador
    }

    public void usarComputadora() {
        procesador.ejecutarInstrucciones();  // Usar el procesador
    }
}
