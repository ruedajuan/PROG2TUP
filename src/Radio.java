public class Radio {
    private  boolean encendida;
    public void encender(){
       encendida=true;
    }
    public void apagar(){
        encendida=false;
    }
    public void estado(){
        if(encendida)System.out.println("Encendida");
        else System.out.println("Apagada");
    }
}
