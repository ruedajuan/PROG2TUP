public class Main {

    public static void main(String[] args) {
	// write your code here

        Fraccion f1 =new Fraccion(8,2);
        f1.toString(f1.getDivisor(), f1.getDividendo());
        Fraccion f2 = new Fraccion(2,4);
        Fraccion f3= new Fraccion(3, 9);
        f1.sumar(f2);
        f1.toString(f1.getDivisor(), f1.getDividendo());
        f3.multiplicar(f2);
        f3.toString(f3.getDivisor(), f3.getDividendo());

    }
}
