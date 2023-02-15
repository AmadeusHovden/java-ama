import java.util.Random;

public class Arayforloop {
    // arrays må være den samme primitive typen, kan ikke blande string og integer..
    // array brukes for å lagre flere verdier i en single variabel.
    public static void main(String[] args) {
        String[] kaker = new String[5];

        kaker[0] = "sry";
        kaker[1] = "sry";
        kaker[2] = "sry";
        kaker[3] = "sry";
        kaker[4] = "jackpot";

        // for loop kjører en blokk med kode et avgrenset antall ganger.
        // motsatt av while loop som kan kjøre en kode evig hvis tilstanden alltid er
        // true.
        // vi vet hvor mange ganger en for loop skal kjøre før vi i det hele tatt kjører
        // den . // for (int i = 0; i < 10; i ++)

        Random tilfeldigKake = new Random();
        int tilfeldigTall = tilfeldigKake.nextInt(kaker.length);

        System.out.println(kaker[tilfeldigTall]);

    }
}