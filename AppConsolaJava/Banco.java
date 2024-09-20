public abstract class Banco{
    private int saldo;
    private int numerodeconta;
    private String cpf;
    private boolean status;
    private String titular;
    public abstract void depositar(int s) throws Exception;
    public abstract boolean transferir(int montante, Banco Destino);
    public abstract void sacar(int s) throws Exception;

    public Banco(int saldo, int numerodeconta,String cpf, boolean status, String titular){
        this.saldo = saldo;
        this.numerodeconta = numerodeconta;
        this.cpf = cpf;
        this.titular = titular;
    }
    @override
    public void consultar(int pin){
        if (pin == 1985) {
            System.out.println("Seu saldo é de " + getSaldo());
            
        } else {
            System.out.println("Pin incorreto!");
        }
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getNumerodeconta() {
        return numerodeconta;
    }
    public void setNumerodeconta(int numerodeconta) {
        this.numerodeconta = numerodeconta;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public boolean getStatus() {
        return status;
    }
}
