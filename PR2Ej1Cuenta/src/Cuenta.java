public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(){
        this.titular="x";
        this.cantidad=0;
    }
    public Cuenta(String titular,double cantidad){
        this.titular=titular;
        this.cantidad=cantidad;
    }

    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
    public void ingresar(double ingreso){
        if(ingreso>0){
            this.cantidad=cantidad+ingreso;
        }
        else ;
    }
    public void retirar(double retirar){
        this.cantidad=cantidad-retirar;
        if (cantidad<0)this.cantidad=0;
    }
}
