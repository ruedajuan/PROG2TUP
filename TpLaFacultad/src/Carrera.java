import java.util.ArrayList;
import java.util.List;

public class Carrera implements Informacion  {
    private String nombre;
    private List<Materia> coleccionMaterias = new ArrayList<Materia>();

    public Carrera(){

    }
    public Carrera(String nombre, List coleccionMaterias) {
        this.nombre = nombre;
        this.coleccionMaterias=coleccionMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColeccionMaterias(List<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }
    public List getColeccionMaterias(){
        return coleccionMaterias;
    }

    public void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }
    public void eliminarMateria(String nombreMateria){
        coleccionMaterias.remove(nombreMateria);
    }
    public void encontrarMateria(String nombreMateria){
        for (Materia mate:coleccionMaterias){
            if (mate.getNombre().equals(nombreMateria)){
                System.out.println("Materia encontrada en la coleccion");
            }
            else System.out.println("Materia no encontrada");
        }
    }
        @Override
    public int verCantidad() {
        int x =coleccionMaterias.size();
        System.out.println(x);
        return x;
    }

    @Override
    public String listarContenidos() {
        return null;
    }

}
