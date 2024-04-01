
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.depositarConta(500.00);

        System.out.println(conta.saldoConta());

        conta.sacarConta(100.00);

        System.out.println(conta.saldoConta());


        ContaNvestimento contaInv = new ContaNvestimento();

        String contaInvesti = contaInv.criarInvestimentoConta(2000.00, "Projetos");
        System.out.println(contaInvesti);

        contaInv.listaInvestimentoConta();


        ContaEspecial contaEsp = new ContaEspecial();
        boolean situacao = contaEsp.definirCreditoConta(1000.00, 1000.00);
        System.out.println("Situação: " + situacao);

        contaEsp.listarCreditoConta();

    }
}