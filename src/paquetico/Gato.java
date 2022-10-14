/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetico;

/**
 *
 * @author Acer
 */
public class Gato extends ClasePadre {

    /**
     * @return the toxoPlasmosis
     */
    public String getToxoPlasmosis() {
        return toxoPlasmosis;
    }

    /**
     * @param toxoPlasmosis the toxoPlasmosis to set
     */
    public void setToxoPlasmosis(String toxoPlasmosis) {
        this.toxoPlasmosis = toxoPlasmosis;
    }
    
    private String toxoPlasmosis;

    public Gato( String nombre, String raza, String color, int edad,String toxoPlasmosis) {
        super(nombre, raza, color, edad);
        this.toxoPlasmosis = toxoPlasmosis;
    }
    
}
