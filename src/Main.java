import entities.*;
import interfaces.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Scegli il tipo di elemento " + (i + 1) + ": ");
            System.out.println("1. Immagine");
            System.out.println("2. RegistrazioneAudio");
            System.out.println("3. Video");
            int scelta = input.nextInt();
            input.nextLine();

            System.out.print("Inserisci il titolo: ");
            String titolo = input.nextLine();

            if (scelta == 1) {
                System.out.print("Inserisci la luminosita: ");
                int luminosita = input.nextInt();
                elementi[i] = new Immagine(titolo, luminosita);

            } else if (scelta == 2) {
                System.out.print("Inserisci la durata: ");
                int durata = input.nextInt();
                System.out.print("Inserisci il volume: ");
                int volume = input.nextInt();
                elementi[i] = new RegistrazioneAudio(titolo, durata, volume);

            } else if (scelta == 3) {
                System.out.print("Inserisci la durata: ");
                int durata = input.nextInt();
                System.out.print("Inserisci il volume: ");
                int volume = input.nextInt();
                System.out.print("Inserisci la luminosita: ");
                int luminosita = input.nextInt();
                elementi[i] = new Video(titolo, durata, volume, luminosita);
            }
        }

        int scelta = -1;
        while (scelta != 0) {
            System.out.print("Quale elemento vuoi eseguire? (1-5, 0 per uscire): ");
            scelta = input.nextInt();

            if (scelta == 0) {
                System.out.println("Arrivederci!");
            } else if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();
                } else if (elemento instanceof Riproducibile) {
                    ((Riproducibile) elemento).play();
                }
            }
        }

        input.close();
    }
}