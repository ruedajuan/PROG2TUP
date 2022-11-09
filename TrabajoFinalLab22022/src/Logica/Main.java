package Logica;

public class Main {

    public static void main(String[] args) {
	// Los angeles Lakers
        Equipos Lakers = new Equipos("Lakers","Los Angeles");
        Jugadores j1 = new Jugadores("Lebron","James","2,06 m");
        Jugadores j2 = new Jugadores("Russel","Westbrook","1,91 m");
        Jugadores j3 = new Jugadores("Anthony","Davis","2,08 m");
        Jugadores j4 = new Jugadores("Patrick", "Beverley","1,88 m");
        Jugadores j5 = new Jugadores("Lonnie","Walker IV","1,93 m");

        Lakers.agregarJugadores(j1);
        Lakers.agregarJugadores(j2);
        Lakers.agregarJugadores(j3);
        Lakers.agregarJugadores(j4);
        Lakers.agregarJugadores(j5);

        Lakers.verPlantilla();

        PartidosNba d1 = new PartidosNba("9/11/22");
       



    }
}
