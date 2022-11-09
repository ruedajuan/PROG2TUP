package Logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Equipos implements Informacion, Serializable {
    private String nombre;
    private String ciudad;
    private List<Jugadores> plantilla = new ArrayList<Jugadores>();

    public Equipos (){
    };
    public Equipos(String nombre, String ciudad){
        this.nombre=nombre;
        this.ciudad=ciudad;
    }
    public void agregarJugadores(Jugadores jugador){
        plantilla.add(jugador);
    }
    public void eliminarJugadores(String apellidoABorrar){
        for(int i=0;i<plantilla.size();i++){
            if(plantilla.get(i).getApellido().equals(apellidoABorrar)){
                plantilla.remove(i);
            }
        }
    }


    @Override
    public String verPlantilla() {
        for (Jugadores jugador:plantilla){
        System.out.println(jugador.toString());
        }
        return null;
    }
}
