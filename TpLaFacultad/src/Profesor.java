public class Profesor extends Persona{
    private double basico;
    private int antiguedad;

    public Profesor(String nombre, String apellido, int legajo,double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico=basico;
        this.antiguedad=antiguedad;
    }


    public void calcularSueldo(double basico, int antiguedad){
        double Sueldo = antiguedad*(basico*0.1)+basico;
    }
}
