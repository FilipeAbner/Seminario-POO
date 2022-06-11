package br.edu.ifnmg.seminariopoo;

public class Main {

    public static void main(String[] args) {
        Cliente clienteProxy = new ProxyCliente(" 'Dados de pagamento para funcionários'", " Jailson");

        clienteProxy.enviarInformacoes();
        System.out.println();

        clienteProxy.enviarInformacoes();
        System.out.println();
    }
}
