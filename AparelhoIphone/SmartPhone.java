package AparelhoIphone;

public class SmartPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void pausarMusica() {
         System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada");;
    }

    public void tocarMusica() {
        System.out.println("Musica tocando");
    }
    
    public void atender() {
        System.out.println("Ligação atendida");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado"); 
    }
    
    public void ligar() {
        System.out.println("Ligando");
    }

    public void exibirPagina() {
        System.out.println("Pagina aberta");
    }

    public void adicionarNovaPagina() {
        System.out.println("Pagina criada");;
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}
