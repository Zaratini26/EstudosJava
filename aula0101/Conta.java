package aula0101;

public class Conta {

    private String nome;
    private Integer numeroConta;
    private Double saldo;
    private Double limite;

    public Conta() {
    }

    public Conta(String nome, Integer numeroConta, Double saldo, Double limite) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public boolean sacar(double valor) {
        if ( valor > this.saldo || valor > this.limite || valor <=0 ) {
            System.out.println("Erro ao realizar saque!");
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean depositar(double valor) {
        if ( valor <= 0) {
            System.out.println("Erro ao realizar deposito!");
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean transferir(double valor, Conta destino) {
        if (destino == null) {
            System.out.println("Erro ao realizar transferir!");
            return false;
        }

        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                ", Número: " + getNumeroConta() +
                ", Saldo: " + getSaldo() +
                ", Limite: " + getLimite();
    }
}
