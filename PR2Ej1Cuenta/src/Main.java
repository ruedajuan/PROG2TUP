public class Main {

    public static void main(String[] args) {
	//Cuenta

        Cuenta c1 = new Cuenta("juan",10000);
        c1.ingresar(-2000);
        c1.retirar(4000);
        System.out.println(c1.getTitular());
        System.out.println(c1.getCantidad());

    }
}
