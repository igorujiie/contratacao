package contratacao.domain.model;

public class Conta {
    private String numero;
    private String agencia;
    private String banco;
    private double saldo;

    public Conta(String numero, String agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getBanco() {
        return banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
