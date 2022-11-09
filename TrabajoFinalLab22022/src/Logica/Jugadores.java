package Logica;

import java.io.Serializable;

public class Jugadores extends Persona implements Serializable {

    public Jugadores(){};

    public Jugadores(String nombre, String apellido, String altura){
        super(nombre, apellido, altura);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
