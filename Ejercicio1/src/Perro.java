/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Perro extends Animal {

    public void ladrar() {
        System.out.println("El perro ladra: Guau Guau");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro hace un sonido: Guau");
    }
}
