package br.edu.ifnmg.seminariopoo;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new ProxyCliente(" Banco de Dados", "Jailson");
        
        cliente.enviarInformacoes();
        System.out.println();
        
        cliente.enviarInformacoes();
        System.out.println();
    }
}
