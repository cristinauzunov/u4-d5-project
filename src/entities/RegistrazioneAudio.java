package entities;
import interfaces.Riproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    int durata;
    int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }
    public int getDurata() {
        return durata;
    }
    public void alzaVolume() {
        volume++;
    }
    public void abbassaVolume() {
        volume--;
    }
    public void play() {
        String esclamativi = "";
        for(int i = 0; i < volume; i++){
            esclamativi = esclamativi + "!";
        }
        for(int i = 0; i < durata; i++){
            System.out.println(titolo+esclamativi);
        }
    }




}
