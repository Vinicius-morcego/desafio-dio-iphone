package model;
import java.util.List;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;
public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    private Object monitor;
    private List<Object> teclado;
    private Object botaoLigarDesligar;
    
    public Object getMonitor() {
        return monitor;
    }

    public void setMonitor(Object monitor) {
        this.monitor = monitor;
    }


    public List<Object> getTeclado() {
        return teclado;
    }

    public void setTeclado(List<Object> teclado) {
        this.teclado = teclado;
    }

    
    public Object getBotaoLigarDesligar() {
        return botaoLigarDesligar;
    }

    public void setBotaoLigarDesligar(Object botaoLigarDesligar) {
        this.botaoLigarDesligar = botaoLigarDesligar;
    }

    @Override
    public void exibirPagina() {
        atualizarPagina();
        System.out.println("Exibindo a pagina...");
    }

    @Override
    public void selecionarNovaAba() {
        System.out.println("Selecionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a musica...");
    }

    @Override
    public void tocar() {
        selecionarMusica();
        System.out.println("Tocando a musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o aparelho...");
        atender();
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

}
