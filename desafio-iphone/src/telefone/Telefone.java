package telefone;

public class Telefone {
    String number;
    boolean accept = false;
    boolean decline = false;
    boolean voice = false;

    public void call(String number1){
        number = number1;
        System.out.println("Ligando para o numero: " + number1);
    }

    public void acceptCall(){
        decline = false;
        if(accept == false){
            System.out.println("Aceitando a ligação...");
            accept = true;
        } else {
            System.out.println("Ligação já aceita...");
        }
    }

    public void declineCall(){
        accept = false;
        if(decline == false){
            System.out.println("Desligando a ligação...");
            decline = true;
        } else {
            System.out.println("Não há nenhuma ligação...");
        }
    }

    public void startVoiceEmail(){
        if(voice == false){
            System.out.println("Iniciando correrio de voz...");
            voice = true;
        } else {
            System.out.println("Correiro de voz já iniciado...");
        }
    }
}
