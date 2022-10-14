/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetico;

/**
 *
 * @author Acer
 */
public class Perro extends ClasePadre {
    int nvlEntrenamiento;

    public Perro( String nombre, String raza, String color, int edad,int nvlEntrenamiento) {
        super(nombre, raza, color, edad);
        this.nvlEntrenamiento = nvlEntrenamiento;
    }
    
}
