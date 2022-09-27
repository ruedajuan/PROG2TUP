import java.util.ArrayList;
import java.util.List;

public class Facultad implements Informacion{
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

 @Override
    public int verCantidad() {
        int x =coleccionCarreras.size();
        System.out.println(x);
        return x;
    }

    @Override
    public String listarContenidos() {
        return null;
    }


}
