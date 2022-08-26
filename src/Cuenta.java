public class Cuenta {
    private int nroAccount;
    private double balance;

    //Constructor

    public Cuenta(int nro){
        nroAccount = nro;
    }

    public int getNroAccount(){
        return nroAccount;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double b){
        balance=b;
    }
    //Metodos de instancia
    public void credit(double amount){
        balance= balance + amount;
    }
    public void debit (double amount){
        balance =balance - amount;

    }
    //Metodos de CLase
    public static void imprimirCuenta(){
        System.out.println("123");
    }

}
