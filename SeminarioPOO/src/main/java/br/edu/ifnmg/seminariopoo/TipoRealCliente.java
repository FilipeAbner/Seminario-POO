package br.edu.ifnmg.seminariopoo;

public class TipoRealCliente implements Cliente {

    public String nomeArquivo;
    public String nome;

    public TipoRealCliente(String nomeArquivo, String nome) {
        this.nomeArquivo = nomeArquivo;
        this.nome = nome;
        carregandoArquivo(nomeArquivo);
    }

    @Override
    public void enviarInformacoes() {
        System.out.println("enviando informacoes do arquivo: " + nomeArquivo);
        System.out.println("nome do Usuario: " + nome);

    }

    public void carregandoArquivo(String nomeArquivo) {
        System.out.println("Carregando arquivo" + nomeArquivo);
    }
}
