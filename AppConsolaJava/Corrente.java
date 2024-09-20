public class Corrente extends Banco {
    private int iim;



    public Corrente(int saldo, int numerodeconta, String cpf, boolean status, String titular) {
        super(saldo, numerodeconta, cpf, status, titular);
        saldo = this.getSaldo();
        
    }

    @override
    public void depositar(int val) throws Exception{
        setIim(3000000);
        if (val >= getIim()) {
            
            throw new Exception("Valor maior que o limite!");
        }


            if (getSaldo() > getIim()) {
                throw new IllegalArgumentException("Valor excede o limite de eposito");
            }    
            setSaldo(getSaldo() + val);
            System.out.println("Deposito de " + val + " saldo agora é de " + getSaldo());

    }

    public boolean levantamentocs(long l, int sal){
            System.out.println("Codigo de levantamento sem cartão");   
            System.out.println(l);
        if (sal <= getSaldo()) {
                switch (sal) {
                    case 200:
                        setSaldo(getSaldo() - 200);
                        System.out.println("Levantamento de R$" + sal);
                        break;
                case 500:
                setSaldo(getSaldo() - 500);
                     sal -= 500;
                System.out.println("Levantamento de R$"+ sal);
                    default:
                    System.out.println("Valor invalido, não permitdo para saque");
                        break;
                }
                System.out.println("Saldo actual: " + this.getSaldo());
                    return true;
            } else {

                System.out.println("Saque não permitido pelo seu banco!");
                return false;
            }



    }
    @override
    public boolean transferir(int montante, Corrente Destino ) throws Exception{
        if (montante > 0 && montante <= getSaldo()) {
            Destino.depositar(montante);
            setSaldo(getSaldo() - montante);
            System.out.println("Saldo de " + Destino.getTitular() + " passa a ser de " + Destino.getSaldo());
            System.out.println("O seu saldo agora é de " + getSaldo());
            return true;
        } else {
            System.out.println("Dinheiro invalido!");
            return false; 
        }
    }

    @override
    public void sacar(int v) throws Exception{
        if (v <= 0) {
            throw new IllegalArgumentException("Valor de saque inválido!");
        }
        if (v > getSaldo()) {
           throw new Exception("Saldo insuficiente");
        }
        setSaldo(getSaldo() - v);
        System.out.println("Saque realizado com sucesso!");



    }
    public int getIim() {
        return iim;
    }
    public void setIim(int iim) {
        this.iim = iim;
    }
    @Override
    public String getCpf() {
        // TODO Auto-generated method stub
        return super.getCpf();
    }

    @Override
    public int getNumerodeconta() {
        // TODO Auto-generated method stub
        return super.getNumerodeconta();
    }

    @Override
    public int getSaldo() {
        // TODO Auto-generated method stub
        return super.getSaldo();
    }


    @Override
    public boolean getStatus() {
        // TODO Auto-generated method stub
        return super.getStatus();
    }
    @Override
    public String getTitular() {
        // TODO Auto-generated method stub
        return super.getTitular();
    }
    @Override
    public void setCpf(String cpf) {
        // TODO Auto-generated method stub
        super.setCpf(cpf);
    }
    @Override
    public void setNumerodeconta(int numerodeconta) {
        // TODO Auto-generated method stub
        super.setNumerodeconta(numerodeconta);
    }

    @Override
    public void setSaldo(int saldo) {
        // TODO Auto-generated method stub
        super.setSaldo(saldo);
    }
    @Override
    public void setStatus(boolean status) {
        // TODO Auto-generated method stub
        super.setStatus(status);
    }

    @Override
    public void setTitular(String titular) {
        // TODO Auto-generated method stub
        super.setTitular(titular);
    }

    @Override
    public boolean transferir(int montante, Banco Destino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }


}
