import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private Profesor titular;
    private List<Estudiante> coleccionEstudiantes= new ArrayList<Estudiante>();

    public Materia(){

    }

    public Materia(String nombre,Profesor titular, List coleccionEstudiantes){
        this.nombre=nombre;
        this.titular=titular;
        this.coleccionEstudiantes=coleccionEstudiantes;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Profesor getTitular(){
        return titular;
    }
    public void setTitular(Profesor titular){
        this.titular=titular;
    }
    public void setColeccionEstudiantes(List coleccionEstudiantes){
        this.coleccionEstudiantes=coleccionEstudiantes;
    }
    public List getColeccionEstudiantes(){
        return coleccionEstudiantes;
    }
    public void agregarEstudiante (Estudiante estudiante){
        coleccionEstudiantes.add(estudiante);
    }
    public void eliminarEstudiante(Estudiante estudiante){
        coleccionEstudiantes.remove(estudiante);
    }
    public void modificarTitular(Profesor titular){
        this.titular=titular;
    }

    private Estudiante e1 = new Estudiante("Jose","Pekerman",222);
    private Estudiante e2 = new Estudiante("Pepe","Argento",223);
    private Estudiante e3 = new Estudiante("Homero","Simpson",224);
    private Estudiante e4 = new Estudiante("Bart","Simpson", 225);
    private Estudiante e5 = new Estudiante("Francia","Doggy",226);
    private Estudiante e6 = new Estudiante("Fernando","Carlos",227);

}
