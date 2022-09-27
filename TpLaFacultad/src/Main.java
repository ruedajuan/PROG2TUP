
public class Main {


    public static void main(String[] args) {

       
        //Facultad
        Facultad unne = new Facultad();
        Facultad utn = new Facultad();

        //Carrera
        Carrera tup = new Carrera();
        Carrera arquitectura = new Carrera();
        Carrera electromecanica = new Carrera();
        
        //Agregar carreras a la Facultad

        unne.agregarCarrera(arquitectura);
        unne.agregarCarrera(electromecanica);
        utn.agregarCarrera(tup);
        utn.agregarCarrera(electromecanica);


        // Materias
        Materia laboratorio= new Materia();
        Materia programacion=new Materia();
        Materia diseño = new Materia();
        Materia matematica= new Materia();
        Materia ingles = new Materia();

        //Agregar materias a una carrera
        tup.agregarMateria(laboratorio);
        tup.agregarMateria(programacion);
        tup.agregarMateria(ingles);


        //Estudiantes
        Estudiante e1 = new Estudiante("Jose","Pekerman",222);
        Estudiante e2 = new Estudiante("Pepe","Argento",223);
        Estudiante e3 = new Estudiante("Homero","Simpson",224);
        Estudiante e4 = new Estudiante("Bart","Simpson", 225);
        Estudiante e5 = new Estudiante("Francia","Doggy",226);
        Estudiante e6 = new Estudiante("Fernando","Carlos",227);

        //Agrego estudiantes a la materia

        laboratorio.agregarEstudiante(e1);
        laboratorio.agregarEstudiante(e2);
        laboratorio.agregarEstudiante(e3);
        laboratorio.agregarEstudiante(e4);

        // elimino un estudiante
        



    }

}
