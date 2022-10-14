
package paquetico;
import java.util.ArrayList;

public class Lista {

    //Declaration of the Arraylist that will keep our data
    
 ArrayList<String>Animales = new ArrayList<String>();
 
 //Declaration of the temporary Variables that will help us to calculate the average age.
 
int sumatoria= 0;
int contadorGatos = 0;
int contadorPerros = 0;

//Printing List Overloaded Function, requesting all the animal's Data.
    public String imprimirLista(String tipoAnimal,String nombre,String Raza,String Color,int Edad,String Especial){

        //Declaration of the temporary Variables that will help us to Print The List.
        String temporal = "";

         String lista = "";
         //Putting all the data on a Organized String
         
        lista += "Tipo de Animal: "+tipoAnimal+"\n"+
                "Nombre del Animal: " + nombre+"\n" + 
                          "Raza del Animal: "+Raza+"\n"+
                          "Color: "+Color+ "\n"+
                          "Edad: "+Edad+"\n"+
                           Especial+"\n"
                          
                          ;
        //Adding this String lista to the Animals ArrayList
        
        Animales.add(lista);
        //Declaring the Counter for the Animal Position in the List.
        int x = 1;
        //Creating an acumulator from the sum of all the ages
        sumatoria = sumatoria+Edad;
        int promedio = sumatoria/Animales.size();
        //Giving the conditions for increase the Cat's or Dog's Counter
        if("Gato".equals(tipoAnimal))contadorGatos++;
        if("Perro".equals(tipoAnimal))contadorPerros++;
        //Saving all the ArrayList on a Temporal String Variable.
            for (int i = 0; i < Animales.size(); i++) {    
            temporal+=x+" ."+Animales.get(i)+"\n"+"El Promedio de edades de los Animales es: "+promedio+"\n"+"Ahora hay "+contadorGatos+" gatos y "+contadorPerros+ " perros.\n"
                    + "-----------------//--------------------\n";
            x++;
        }
    //Returning this Temporal String  
    return temporal;
    }
    //Delete An Element of the list: Overloading Function, that receives the Position.
      
    public String eliminarPosicion(int posicion){
  //Creation of a String temporal variable.
        String temporal = "";
        //Creating the position Index to delete.
        int posicionEliminar = posicion-1;
        //Deleting the element of the arraylist
    Animales.remove(posicionEliminar);
    int x = 1;
    //Rewritting the List
        for (int i = 0; i < Animales.size(); i++) {
            temporal+=x+" ."+Animales.get(i)+"\n";
             x++;
        }
       //Returning the List
        return temporal;
    }

}
