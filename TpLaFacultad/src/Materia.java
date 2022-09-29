import java.util.ArrayList;
import java.util.List;

public class Materia implements Informacion{
    private String nombre;
    private Profesor titular;
    private List<Estudiante> coleccionEstudiantes=new ArrayList<Estudiante>();

    public Materia(){

    }

    public Materia(String nombre,Profesor titular, List<Estudiante> coleccionEstudiantes){
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
    public void setColeccionEstudiantes(List<Estudiante> coleccionEstudiantes){
        this.coleccionEstudiantes=coleccionEstudiantes;
    }
    public List<Estudiante> getColeccionEstudiantes(){
        return coleccionEstudiantes;
    }
    public void agregarEstudiante (Estudiante estudiante){
        coleccionEstudiantes.add(estudiante);
    }
    public void eliminarEstudiante(String estudianteApellidoABorrar){
        for(int i=0;i<coleccionEstudiantes.size();i++){
            if(coleccionEstudiantes.get(i).getApellido().equals(estudianteApellidoABorrar)){
                coleccionEstudiantes.remove(i);
            }
        }

    }
    public void modificarTitular(Profesor titular){
        this.titular=titular;
    }


    @Override
    public int verCantidad() {
        int x =coleccionEstudiantes.size();
        System.out.println("Estudiantes en "+getNombre()+" :"+x);
        return x;
    }

    @Override
    public String listarContenidos() {
        int salida;
        
        return null;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes +
                '}';
    }
}
