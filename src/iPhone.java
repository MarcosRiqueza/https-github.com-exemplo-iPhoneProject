package src;

public class iPhone {
    private AparelhoTelefonico aparelho;
    private ReprodutorMusical reprodutor;
    private NavegadorInternet navegador;

    public iPhone() {
        aparelho = new AparelhoTelefonico();
        reprodutor = new ReprodutorMusical();
        navegador = new NavegadorInternet();
    }

    public void ligar() {
        aparelho.fazerChamada();
    }

    public void tocarMusica() {
        reprodutor.tocarMusica();
    }

    public void navegarNaInternet() {
        navegador.navegar();
    }
}
