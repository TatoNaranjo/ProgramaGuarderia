
package paquetico;
import java.util.ArrayList;

public class Lista {

 ArrayList<String>Animales = new ArrayList<String>();
int sumatoria= 0;
int contadorGatos = 0;
int contadorPerros = 0;
    public String imprimirLista(String tipoAnimal,String nombre,String Raza,String Color,int Edad,String Especial){

        String temporal = "";

         String lista = "";
        lista += "Tipo de Animal: "+tipoAnimal+"\n"+
                "Nombre del Animal: " + nombre+"\n" + 
                          "Raza del Animal: "+Raza+"\n"+
                          "Color: "+Color+ "\n"+
                          "Edad: "+Edad+"\n"+
                           Especial+"\n"
                          
                          ;
        Animales.add(lista);
        int x = 1;
        
        sumatoria = sumatoria+Edad;
        int promedio = sumatoria/Animales.size();
        if("Gato".equals(tipoAnimal))contadorGatos++;
        if("Perro".equals(tipoAnimal))contadorPerros++;
            for (int i = 0; i < Animales.size(); i++) {    
            temporal+=x+" ."+Animales.get(i)+"\n"+"El Promedio de edades de los Animales es: "+promedio+"\n"+"Ahora hay "+contadorGatos+" gatos y "+contadorPerros+ " perros.\n"
                    + "-----------------//--------------------\n";
            x++;
        }
           
    return temporal;
    }
    
    public String eliminarPosicion(int posicion){
  
        String temporal = "";
        int posicionEliminar = posicion-1;
    Animales.remove(posicionEliminar);
    int x = 1;
        for (int i = 0; i < Animales.size(); i++) {
            temporal+=x+" ."+Animales.get(i)+"\n";
             x++;
        }
       
        return temporal;
    }

}
