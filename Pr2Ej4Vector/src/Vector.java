public class Vector {
    private int x,y,z;

    public Vector(int x, int y,int z){
        this.x= x;
        this.y=y;
        this.z=z;
    }
    public Vector(){
        this.x= 0;
        this.y=0;
        this.z=0;
    }

    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }
    public void setZ(int z){
        this.z=z;
    }
    public void metodo1(int numero){
        this.x=x*numero;
        this.y=y*numero;
        this.z=z*numero;
    }
    public void metodo2 (Vector v){
        if (v.x!=0 && v.y!=0 && v.z!=0){
            this.x=x+v.x;
            this.y=y+v.y;
            this.z=z+v.z;
        }
        else {
            System.out.println("Error por falta de argumentos en el vector argumento");
        }
    }
    public void toString( Vector v){
        System.out.println(v.x+" "+ v.y+ " "+v.z);
    }

}
