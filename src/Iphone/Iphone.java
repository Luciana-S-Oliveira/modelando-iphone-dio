package Iphone;

import Dispositivos.AparelhoTelefonico;
import Dispositivos.NavegadorInternet;
import Dispositivos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void iniciarIphone() {
        System.out.println("INICIANDO IPHONE");
    }

    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);
    }

    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }
    public void pausar() {
        System.out.println("PAUSANDO");
    }
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA: " + musica);
    }
}