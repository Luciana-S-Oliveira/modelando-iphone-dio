import Iphone.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone meuTelefone = new Iphone();
        meuTelefone.iniciarIphone();
        meuTelefone.ligar("123456789");
        meuTelefone.atender();
        meuTelefone.iniciarCorreioVoz();
        meuTelefone.selecionarMusica("Nome da Musica");
        meuTelefone.tocar();
        meuTelefone.pausar();
        meuTelefone.exibirPagina("www.site.com");
        meuTelefone.atualizarPagina();
        meuTelefone.adicionarNovaAba();
    }
}