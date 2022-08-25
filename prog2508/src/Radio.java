public class Radio {
    private boolean encendida;
    public Perilla perilla= new Perilla();

    public void encender(){
        encendida=true;
    }
    public void apagar(){
        encendida=false;
    }
}
