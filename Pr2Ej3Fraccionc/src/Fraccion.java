public class Fraccion {
    private int dividendo;
    private int divisor;

    public Fraccion() {
        this.dividendo = 0;
        this.divisor = 1;
    }

    public Fraccion(int divisor, int dividendo) {
        this.divisor = divisor;
        this.dividendo = dividendo;
    }

    public void toString(int divisor, int dividendo) {
        System.out.println(dividendo + "/" + divisor);
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int divisor) {
        this.divisor = divisor;
    }

    public void sumar(Fraccion f) {
        this.dividendo = dividendo * f.divisor + divisor * f.dividendo;
        this.divisor = divisor * f.divisor;

    }
    public void multiplicar (Fraccion f){
        this.dividendo=dividendo*f.dividendo;
        this.divisor=divisor*f.divisor;
    }


}

