public class Main {

    public static void main(String[] args) {
	// write your code here
        Libro l1 = new Libro();
        Libro l2 = new Libro();

        l1.setAutor("Juan");
        l1.setIsbn(123123123);
        l1.setTitulo("Terror");
        l1.setNumeroDePaginas(666);
        l2.setAutor("Ignacio");
        l2.setIsbn(879789789);
        l2.setTitulo("Suspenso");
        l2.setNumeroDePaginas(999);

        l1.toString(l1.getIsbn(), l1.getAutor(), l1.getNumeroDePaginas());
        l2.toString(l2.getIsbn(),l2.getAutor(),l2.getNumeroDePaginas());

        if(l1.getNumeroDePaginas()> l2.getNumeroDePaginas()){
            System.out.println("El libro "+ l1.getTitulo()+" tiene mas páginas que " + l2.getTitulo());
        }
        else System.out.println("El libro "+ l2.getTitulo()+" tiene mas páginas que " + l1.getTitulo());



    }
}
