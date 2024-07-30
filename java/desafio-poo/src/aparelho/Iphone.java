package aparelho;

import funcionalidades.aparelhotelefonico.AparelhoTelefonico;
import funcionalidades.navegadorinternet.NavegadorInternet;
import funcionalidades.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Você aceita atender?");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de Voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println(url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atulizar pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecione a múscia: " + musica);
    }

}
