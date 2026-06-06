package entities;

public class Immagine extends ElementoMultimediale {

    int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        String asterischi = "";
        for (int i = 0; i < luminosita; i++) {
            asterischi = asterischi + "*";
        }
        System.out.println(titolo + asterischi);
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }
}