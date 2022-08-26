public class Auto {

    String color;
    String nombre;
    String marca;
    String modelo;
    public Radio radio;

    int cantidadPuertas;
    void cambiarColor(String c){
        color = c;
    }
    public void setMarca(String m){
        marca =m;
    }
    public String getMarca(){
        return marca;
    }
    public void setCantidadPuertas(int cp){
        if(cp<0)
            cantidadPuertas=0;
        else if (cp>8)
            cantidadPuertas=8;
        else
            cantidadPuertas=cp;
    }
    public int getCantidadPuertas(){
        return cantidadPuertas;
    }
    public void construirFordBlanco4Puertas(){
        marca="Ford";
        cantidadPuertas=4;
        color="Violeta";
    }
    public void setColor(String algo){
        color = algo;
    }
    public String getColor(){
        return color;
    }



}
