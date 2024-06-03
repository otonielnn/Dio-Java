public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    private String musica;
    private String numero;
    private String url;

    @Override
    public void pausar() {
        if (this.getMusica() != null) {
            System.out.println("Pausando a música.");
        } else {
            System.out.println("Não tem nenhuma música selecionada.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (this.getMusica() != null) {
            System.out.println("Selecionando a música: " + musica);
        } else {
            System.out.println("Não tem nenhuma música selecionada.");
        }
    }

    @Override
    public void tocar() {
        if (this.getMusica() == null) {
            System.out.println("Tocando a música.");
        } else {
            System.out.println("Não tem nenhuma música selecionada.");
        }
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreiaVoz() {
        System.out.println("Iniciando o correio de voz.");
    }

    @Override
    public void ligar(String numero) {
        this.setNumero(numero);
        System.out.println("Ligando para o número: " + this.getNumero());
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo mais uma aba do navegador.");
    }

    @Override
    public void atualizarPagina() {
        if (this.getUrl() != null) {
            System.out.println("Atualizando a página.");
        } else {
            System.out.println("Você não está em uma página.");
        }
    }

    @Override
    public void exibirPagina(String url) {
        this.setUrl(url);
        System.out.println("Exibidno a página: " + this.getUrl());
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
