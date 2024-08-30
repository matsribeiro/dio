package musica;

public class Musica {
    String music;
    boolean tocando = false;
    boolean pause = false;

    public void selectMusic(String music1){
        music = music1;
        System.out.println("A música selecionada foi: " + music1);
        play();
    }

    public void play(){
        pause = false;
        if(tocando == false){
            System.out.println("Tocando... " + music);
            tocando = true;
        } else {
            System.out.println("A música já esta tocando...");
        }
    }

    public void pause(){
        tocando = false;
        if (pause == false) {
            System.out.println("Pausando... " + music);
            pause = true;
        } else {
            System.out.println("A música já esta pausada...");
        }
        
    }
}
