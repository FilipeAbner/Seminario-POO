package br.edu.ifnmg.seminariopoo;

public class ProxyCliente implements Cliente {
    //Pode realizar mascaramento de IP, informações do usuário, etc.
    private TipoRealCliente cliente;
    private String nomeArquivo;
    private String nome;

    public ProxyCliente(String nomeArquivo, String nome) {
        this.nomeArquivo = nomeArquivo;
        this.nome = nome;   
    }


    @Override
    public void enviarInformacoes() {
        if (cliente == null) {
            System.out.println("Instancia nao existe...Criando instancia para o cliente" + nome);
             
            cliente = new TipoRealCliente(nomeArquivo,nome);
           
        } else {
            System.out.println("Recuperando instancia anteriormente criada");
            //age como memoria cache
        }
        cliente.enviarInformacoes();
    }

}
