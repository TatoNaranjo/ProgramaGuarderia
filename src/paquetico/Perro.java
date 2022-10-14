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
 //Declarating the Special Atribute of the Cat
    private int nvlEntrenamiento;
    
    //Getters & Setters
    
    /**
     * @return the nvlEntrenamiento
     */
    public int getNvlEntrenamiento() {
        return nvlEntrenamiento;
    }

    /**
     * @param nvlEntrenamiento the nvlEntrenamiento to set
     */
    public void setNvlEntrenamiento(int nvlEntrenamiento) {
        this.nvlEntrenamiento = nvlEntrenamiento;
    }
    

    public Perro( String nombre, String raza, String color, int edad,int nvlEntrenamiento) {
        super(nombre, raza, color, edad);
        this.nvlEntrenamiento = nvlEntrenamiento;
    }
    
}
