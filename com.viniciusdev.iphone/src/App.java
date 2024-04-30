import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;
import model.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        ligarTelefone();
        tocarMusica();
        navegarInternet();
    }

    public static void ligarTelefone(){
        AparelhoTelefonico aparelhoTelefonico = new Iphone();
        aparelhoTelefonico.ligar();
    }
    public static void tocarMusica(){
        ReprodutorMusical reprodutor = new Iphone();
        reprodutor.tocar();
    }
    public static void navegarInternet(){
        NavegadorInternet navegador = new Iphone();
        navegador.exibirPagina();
    }
}
