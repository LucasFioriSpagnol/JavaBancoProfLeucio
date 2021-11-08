package banco;

public class ContaBanco {
    private int numero;
    private String nome; 
    private double saldo;
    
    
    public ContaBanco() {
        this.numero=0;
        this.nome= "";
        this.saldo=0;
        
    }
    public int getNumero() {
        return numero; 
    }
    public void setNumero(int numero) {
        this.numero = numero; 
    }
    public String getNome() {
        return nome; 
    }
    public void setNome(String nome) {
        this.nome = nome; 
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  
    boolean saca(double quantidade) {
        if (this.saldo<quantidade)
    return false;
    else {
        this.saldo = this.saldo - quantidade;
    return true; 
        }
    }
    void deposita(double quantidade) {
        this.saldo = this.saldo + quantidade;
    }
    void inseredados(String a, int b, float c){
        this.nome = a;
        this.numero = b;
        this.saldo = c;
       
    }
    void mostrardado(){
        System.out.println("Nome da Conta: " + this.getNome() );
        System.out.println("Numero da Conta: " + this.getNumero() );
        System.out.println("Saldo atual: " + this.getSaldo() );
    }
    void mostrarsal(){
            System.out.println("Saldo Atual: " + this.getSaldo()); 
        
    }
}

