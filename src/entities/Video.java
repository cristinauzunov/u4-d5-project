package entities;
import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile {
    int durata;
    int volume;
    int luminosita;

    public Video( String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }
    public int getDurata() {
        return durata;
    }
    public void alzaVolume() {
        volume++;
    }
    public void abbasssVolume() {
        volume--;
    }
    public void aumentaLuminosita() {
        luminosita++;
    }
    public void diminuisciLuminosita() {
        luminosita--;
    }
    public void play() {
        String esclamativi = "";
        for(int i = 0; i < volume; i++) {
            esclamativi += "#";
        }
        String asterischi = "";
        for(int i = 0; i < luminosita; i++) {
            asterischi += "*";
        }
        for(int i = 0; i < durata; i++) {
            System.out.println(titolo + esclamativi + asterischi);
        }
    }
}
