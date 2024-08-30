import musica.Musica;
import telefone.Telefone;

public class Iphone {
    public static void main(String[] args){
        Musica reprodorMusical = new Musica();
        Telefone aparelhoTelefone = new Telefone();

        reprodorMusical.selectMusic("Post Malone - What Don't Belong");
        reprodorMusical.pause();
        reprodorMusical.play();

        aparelhoTelefone.call("31 9 8395-7390");
        aparelhoTelefone.acceptCall();
        aparelhoTelefone.declineCall();
        aparelhoTelefone.startVoiceEmail();

    }
}
