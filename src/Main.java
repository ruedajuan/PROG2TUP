public class Main {

    public static void main(String[] args) {
        // UML Lenguage modelado Unificado
        Auto a1 = new Auto();  //convierto en objeto a1
        a1.color ="gris";
        a1.cambiarColor("rojo");
        a1.setMarca("ford");
        a1.radio.encender();
        System.out.println(a1.color);
        System.out.println(a1.getMarca());
        a1.setCantidadPuertas(22);
        System.out.println(a1.getCantidadPuertas());
        //nuevo metodo
        Auto a2= new Auto();
        a2.construirFordBlanco4Puertas();
        System.out.println(a2.getColor());

        //Cuenta bancaria
        /*
        Cuenta ac1 = new Cuenta(1234);
        ac1.setBalance(500);
        ac1.credit(100);
        ac1.debit(300);
        System.out.println(ac1.getNroAccount());
        */






    }
}
