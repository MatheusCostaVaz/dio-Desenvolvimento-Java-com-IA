
import aparelho.Iphone;

public class UtilizandoAparelho {

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.ligar("98987878787");
        meuIphone.atender();
        meuIphone.atualizarPagina();
        meuIphone.exibirPagina("www.google.com.br");
    }
}
