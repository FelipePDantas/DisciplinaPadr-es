public class ContaEspecial extends Conta{

    private double valorCreditoDisponivel;

    public ContaEspecial() {
    }

    public double getValorCreditoDisponivel() {
        return valorCreditoDisponivel;
    }

    public void setValorCreditoDisponivel(double valorCreditoDisponivel) {
        this.valorCreditoDisponivel = valorCreditoDisponivel;
    }

    void listarCreditoConta(){
        System.out.println("Crédito disponível: " + this.valorCreditoDisponivel + " Limite para uso: " + this.limiteConta);
    }

    boolean definirCreditoConta(double valorCredito, double limiteCredito){
        this.valorCreditoDisponivel = valorCredito;
        this.limiteConta = limiteCredito;
        return true;
    }

}
