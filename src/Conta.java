public class Conta {
    double saldoConta;
    int numeroConta;
    String nomeCliente;
    double limiteConta;

    public Conta() {
    }

    public Conta(double saldo, int numero, String nome, double limite) {
        this.saldoConta = saldo;
        this.numeroConta = numero;
        this.nomeCliente = nome;
        this.limiteConta = limite;
    }

    double depositarConta(double quantidade) {
        double novoSaldo = this.saldoConta + quantidade;
        this.saldoConta = novoSaldo;
        return this.saldoConta;
    }

    double saldoConta() {
        return this.saldoConta;
    }

    void sacarConta(double quantidade) {
        double novoSaldo = this.saldoConta - quantidade;
        this.saldoConta = novoSaldo;
    }
}
