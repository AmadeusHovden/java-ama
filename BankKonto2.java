public class BankKonto2 {
    private int balanse; // ikke statisk - tilhører hvert objekt av klassen
    private static int antallKontoer = 0; // statisk - tilhører klassen, deles mellom alle objekter
    public final String bankNavn = "MinBank"; // final - uforanderlig verdi som kan leses offentlig

    public BankKonto2() {
        antallKontoer++;
    }

    public void innskudd(int amount) { // ikke statisk - tilhører hvert objekt av klassen
        balanse += amount;
    }

    public void uttak(int amount) { // ikke statisk - tilhører hvert objekt av klassen
        if (balanse >= amount) {
            balanse -= amount;
        }
    }

    public int getBalanse() { // ikke statisk - tilhører hvert objekt av klassen
        return balanse;
    }

    public static int getAntallKontoer() { // statisk - tilhører klassen, deles mellom alle objekter
        return antallKontoer;
    }
}

/*
 * Statiske felt og metoder tilhører klassen og ikke objektene av klassen. De
 * kan brukes uten å opprette et objekt av klassen og kan deles mellom alle
 * objekter av klassen.
 * 
 * Ikke-statiske felt og metoder tilhører objektene av klassen. De kan bare
 * brukes når et objekt av klassen er opprettet, og hver instans av klassen har
 * sine egne verdier for disse feltene.
 * 
 * "Final" brukes til å definere variabler som ikke kan endres etter
 * initialisering. En final variabel kan bare bli tildelt en verdi én gang, og
 * etter det kan ikke verdien endres.
 */