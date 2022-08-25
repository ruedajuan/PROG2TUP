public class Main {

    public static void main(String[] args) {
	// write your code here

        Persona p1 = new Persona("Juan");

        Auto a1 = new Auto("blanco","ford");
        a1.radio.encender();
        a1.radio.perilla.subir();
        a1.conductor = p1; //asociados debilmente
        // a1 = null; //para destruir el objeto

        System.out.println(a1.conductor.getNombre());
    }
}
