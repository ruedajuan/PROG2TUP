public class Perilla {
    private int volumen=0;

    public int getVolumen(){
        return volumen;
    }

    public void subir(){
        if(volumen<99)
        this.volumen=this.volumen+1;
        else volumen=100;

    }
    public void bajar (){
        if(volumen>1)
        this.volumen=this.volumen-1;
        else volumen=0;
    }
}
