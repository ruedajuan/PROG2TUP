import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private List<Carrera>coleccionCarreras = new ArrayList<Carrera>();

    public Facultad(){
    }

    public Facultad(String nombre,List coleccionCarreras) {
        this.nombre=nombre;
        this.coleccionCarreras=coleccionCarreras;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColeccionCarreras(List coleccionCarreras){
        this.coleccionCarreras=coleccionCarreras;
    }
    public List getColeccionCarreras(){
        return coleccionCarreras;
    }

    void agregarCarrera(Carrera carrera){
        coleccionCarreras.add(carrera);
    }
    void eliminarCarrera(String nombreCarrera){
        for (Carrera carre:coleccionCarreras){
            if(carre.getNombre().equals(nombreCarrera)){
                coleccionCarreras.remove(carre);
            }
        }

    }
    void eliminarEstudiante(Estudiante estudiante){
    }
    //Carreras
    private Carrera tup = new Carrera();
    private Carrera arquitectura = new Carrera();
    private Carrera electromecanica = new Carrera();
    private Carrera quimica = new Carrera();
    private Carrera civil = new Carrera();



}
